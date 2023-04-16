package io.github.embedded.hc.aom.rest.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListSamplesRequest {
    @JsonProperty("samples")
    private List<QuerySample> samples;

    @JsonProperty("statistics")
    private List<String> statistics;

    @JsonProperty("period")
    @NotNull
    private Integer period = null;

    @JsonProperty("time_range")
    private String timeRange;
}
