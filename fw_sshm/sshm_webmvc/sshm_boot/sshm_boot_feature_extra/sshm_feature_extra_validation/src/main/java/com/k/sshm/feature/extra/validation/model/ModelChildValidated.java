package com.k.sshm.feature.extra.validation.model;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Validated
@Data
public class ModelChildValidated {
    @NotBlank
    @NotEmpty
    private String str;
}
