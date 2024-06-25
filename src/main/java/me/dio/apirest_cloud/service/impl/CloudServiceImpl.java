package me.dio.apirest_cloud.service.impl;

import me.dio.apirest_cloud.domain.model.Cloud;
import me.dio.apirest_cloud.domain.model.repository.CloudRepository;
import me.dio.apirest_cloud.service.CloudService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CloudServiceImpl implements CloudService {
    private CloudRepository cloudRepository;

    public CloudServiceImpl(CloudRepository cloudRepository) {
        this.cloudRepository = cloudRepository;
    }

    @Override
    public Cloud findbyId(Integer id) {
        return cloudRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Cloud create(Cloud cloudToCreate) {
        if(cloudRepository.existsByAcronym(cloudToCreate.getAcronym())){
            throw new IllegalArgumentException("This cloud type already exists");
        }
        return cloudRepository.save(cloudToCreate);
    }
}
