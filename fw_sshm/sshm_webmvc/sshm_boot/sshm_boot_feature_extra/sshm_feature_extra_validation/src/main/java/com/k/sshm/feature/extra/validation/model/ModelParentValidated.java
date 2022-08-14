package com.k.sshm.feature.extra.validation.model;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Valid
@Data
public class ModelParentValidated {
    @AssertFalse
    private Boolean booleanFalse;
    @AssertTrue
    private Boolean booleanTrue;
    @DecimalMax(value = "5")
    @Min(1)
    private double decimalMax;
    @DecimalMin(value = "1")
    @Max(5)
    private double decimalMin;
    @Future
    @NotNull
    @FutureOrPresent
    private Date future;
    @NotNull
    private Integer numNotNull;
    @Null
    private Integer numNull;
    @Negative
    @NegativeOrZero
    private int negativeNum;
    @NotBlank
    @NotEmpty
    private String str;
    @Past
    @NotNull
    @PastOrPresent
    private Date past;
    @Positive
    @PositiveOrZero
    private int positiveNum;
    @Size(min = 2, max = 10)
    private List<String> list;
    private Set<String> set;
    @NotNull
    @Size(min = 2, max = 10)
    private List<ModelChildValidated> childList;
    private Set<ModelChildValidated> childSet;
}
