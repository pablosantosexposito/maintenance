package com.mygarage.maintenance.api.rest.controller;

import com.mygarage.maintenance.controllers.MaintenanceApi;
import com.mygarage.maintenance.model.AllMaintenancesResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MaintenanceController implements MaintenanceApi {

    @Override
    public ResponseEntity<AllMaintenancesResponse> getAllMaintenances() {
        return null;
    }
}
