package com.laman.paydaytradesystem.controller;

import com.laman.paydaytradesystem.model.dto.request.DepositRequestDto;
import com.laman.paydaytradesystem.model.dto.response.DepositResponse;
import com.laman.paydaytradesystem.service.DepositService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/payday/v1/deposit")
public class DepositController {

    private final DepositService depositService;

    @PostMapping("/{userId}")
    public ResponseEntity<DepositResponse> depositCash(
            @PathVariable Long userId,
            @RequestBody DepositRequestDto request) {

        DepositResponse response = depositService.depositCash(userId, request.getAmount());
        return ResponseEntity.ok(response);
    }
}
