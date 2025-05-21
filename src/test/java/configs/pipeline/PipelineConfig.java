package configs.pipeline;

public class PipelineConfig {
    public static boolean testRailReport = System.getenv("CI") != null;
    public static boolean isBrowserHeadless = System.getenv("CI") != null;

}
