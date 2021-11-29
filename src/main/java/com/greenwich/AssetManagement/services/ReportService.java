package com.greenwich.AssetManagement.services;

import java.util.List;

import com.greenwich.AssetManagement.Model.DTO.ReportDTO;

public interface ReportService {
	List<ReportDTO> getAssetReport();
}
