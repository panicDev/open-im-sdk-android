package io.openim.android.sdk.models

data class SearchResult(
    var totalCount: Int = 0,
    var searchResultItems: List<SearchResultItem>? = null,
    var findResultItems: List<SearchResultItem>? = null
)
