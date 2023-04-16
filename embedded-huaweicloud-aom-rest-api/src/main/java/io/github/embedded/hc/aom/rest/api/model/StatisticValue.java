package io.github.embedded.hc.aom.rest.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StatisticValue {
    @JsonProperty("statistic")
    private String statistic;

    @JsonProperty("value")
    private Double value;
}
