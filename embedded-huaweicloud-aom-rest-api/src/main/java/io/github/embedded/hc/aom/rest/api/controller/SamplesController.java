package io.github.embedded.hc.aom.rest.api.controller;

import io.github.embedded.hc.aom.rest.api.delegate.SamplesDelegate;
import io.github.embedded.hc.aom.rest.api.model.ListSamplesRequest;
import io.github.embedded.hc.aom.rest.api.model.ListSamplesResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "#{aomApiConfig.baseUrl}/v2", produces = "application/json", consumes = "application/json")
public class SamplesController {
    private final SamplesDelegate samplesDelegate;

    public SamplesController(@Autowired SamplesDelegate samplesDelegate) {
        this.samplesDelegate = samplesDelegate;
    }

    @PostMapping(value = "/{project_id}/samples")
    public ResponseEntity<ListSamplesResp> listSamples(@PathVariable("project_id") String projectId,
                                                       @RequestBody ListSamplesRequest listSamplesRequest) {
        return this.samplesDelegate.listSamples(projectId, listSamplesRequest);
    }
}
