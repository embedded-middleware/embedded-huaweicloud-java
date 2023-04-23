package io.github.embedded.hc.aom.rest.api.delegate;

import io.github.protocol.codec.hc.aom.ListSamplesReq;
import io.github.protocol.codec.hc.aom.ListSamplesResp;
import org.springframework.http.ResponseEntity;

public interface SamplesDelegate {
    ResponseEntity<ListSamplesResp> listSamples(String projectId, ListSamplesReq listSamplesRequest);
}
