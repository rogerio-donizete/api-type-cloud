package me.dio.apirest_cloud.service;

import me.dio.apirest_cloud.domain.model.Cloud;

public interface CloudService {
    Cloud findbyId(Integer id);
    Cloud create(Cloud cloudToCreate);
}
