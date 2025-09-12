package io.openim.android.sdk.models;

/**
 * apiUrl              API server URL, e.g. http://xxx:10000
 * wsUrl               WebSocket server URL, e.g. ws://xxx:17778
 * storageDir          Data storage directory path
 * logLevel            Log level, e.g. 6
 * isLogStandardOutput Whether to print logs to the console
 * logFilePath         Path for log output
 */
public class InitConfig {
    public InitConfig(String apiUrl, String wsUrl, String storageDir) {
        this.apiAddr = apiUrl;
        this.wsAddr = wsUrl;
        this.dataDir = storageDir;
    }

    public final int platformID = 2;
    public String apiAddr;
    public String wsAddr;
    public String dataDir;
    public int logLevel = 6;
    public boolean isLogStandardOutput;
    public String logFilePath;
}
