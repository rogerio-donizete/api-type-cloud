package me.dio.apirest_cloud.controller;

import me.dio.apirest_cloud.domain.model.Cloud;
import me.dio.apirest_cloud.service.CloudService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/clouds")
public class CloudController {
    private CloudService cloudService;

    public CloudController(CloudService cloudService) {
        this.cloudService = cloudService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cloud> findById(@PathVariable Integer id){
        Cloud cloud = cloudService.findbyId(id);
        return ResponseEntity.ok(cloud);
    }

    @PostMapping
    public ResponseEntity<Cloud> create (@RequestBody Cloud cloudToCreate){
        Cloud cloudCreated = cloudService.create(cloudToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/id")
                .buildAndExpand(cloudCreated.getAcronym()).toUri();
        return ResponseEntity.created(location).body(cloudCreated);
    }
}
