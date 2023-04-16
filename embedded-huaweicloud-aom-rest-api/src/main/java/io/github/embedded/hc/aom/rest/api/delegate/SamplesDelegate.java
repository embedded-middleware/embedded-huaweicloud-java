package io.github.embedded.hc.aom.rest.api.delegate;

import io.github.embedded.hc.aom.rest.api.model.ListSamplesRequest;
import io.github.embedded.hc.aom.rest.api.model.ListSamplesResp;
import org.springframework.http.ResponseEntity;

public interface SamplesDelegate {
    ResponseEntity<ListSamplesResp> listSamples(String projectId, ListSamplesRequest listSamplesRequest);
}
