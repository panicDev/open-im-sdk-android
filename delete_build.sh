#!/bin/bash

delete_build_folders() {
  # Traverse subdirectories in the given folder, including hidden ones
  shopt -s dotglob
  for dir_name in "$1"/*; do
    if [ -d "$dir_name" ]; then
      if [ "$(basename "$dir_name")" = "build" ]||[ "$(basename "$dir_name")" = ".gradle" ]; then
        # Delete build folder
        rm -rf "$dir_name"
        echo "Removed folder: $dir_name"
      else
        # Recursively delete build folders in subdirectories
        delete_build_folders "$dir_name"
      fi
    fi
  done
}

# Get user-specified folder path
# shellcheck disable=SC2162
read -p "Enter the folder path to delete: " folder_path

# Delete folders
delete_build_folders "$folder_path"

# Remove the specified folder itself
rm -rf "$folder_path"
echo "Removed folder: $folder_path"
echo "Done!"
