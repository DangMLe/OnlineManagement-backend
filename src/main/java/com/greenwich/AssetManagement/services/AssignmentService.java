package com.greenwich.AssetManagement.services;

import com.greenwich.AssetManagement.Model.DTO.AssignmentDTO;
import com.greenwich.AssetManagement.Model.Entity.Asset;
import com.greenwich.AssetManagement.Model.Entity.Assignment;
import com.greenwich.AssetManagement.Model.Entity.Employee;
import org.springframework.expression.spel.ast.Assign;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface AssignmentService {

    List<Assignment> getAllAssignments();

    Optional<Assignment> findAssignmentById(Long id);

    List<Assignment> getAllAssignmentsbyDate(Date date);

    Assignment updateAssignment(Long id, AssignmentDTO dto);

    Assignment updateAssignmentStatus(Long id, int status);

    Assignment createAssignment(Assignment assignment);

    List<Assignment> getAssignmentByAssignedToEmployee(Employee employee);

    boolean deleteAssignment(Long assignmentId);

    AssignmentDTO convertToDTO(Assignment assignment);

    Assignment convertToEntity(AssignmentDTO assignmentDTO);
    
    boolean existsAssignmentByAsset(Asset asset);

    List<Assignment> searchAssignments(String searchText);
    
    boolean existsByAssetAndStatusNot(Asset asset, int status);
}
