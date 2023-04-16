package io.github.embedded.hc.aom.rest.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class SampleDataValue {
    @JsonProperty("sample")
    private QuerySample sample;

    @JsonProperty("data_points")
    private List<MetricDataPoints> dataPoints;
}
