package net.william278.husksync.data;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Stores information about a player's statistics
 */
public class StatisticsData {

    /**
     * Map of untyped statistic names to their values
     */
    @SerializedName("untyped_statistics")
    public Map<String, Integer> untypedStatistic;

    /**
     * Map of block type statistics to a map of material types to values
     */
    @SerializedName("block_statistics")
    public Map<String, Map<String, Integer>> blockStatistics;

    /**
     * Map of item type statistics to a map of material types to values
     */
    @SerializedName("item_statistics")
    public Map<String, Map<String, Integer>> itemStatistics;

    /**
     * Map of entity type statistics to a map of entity types to values
     */
    @SerializedName("entity_statistics")
    public Map<String, Map<String, Integer>> entityStatistics;

    public StatisticsData(@NotNull Map<String, Integer> untypedStatistic,
                          @NotNull Map<String, Map<String, Integer>> blockStatistics,
                          @NotNull Map<String, Map<String, Integer>> itemStatistics,
                          @NotNull Map<String, Map<String, Integer>> entityStatistics) {
        this.untypedStatistic = untypedStatistic;
        this.blockStatistics = blockStatistics;
        this.itemStatistics = itemStatistics;
        this.entityStatistics = entityStatistics;
    }

    public StatisticsData() {
    }

}