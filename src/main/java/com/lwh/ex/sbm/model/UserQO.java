package com.lwh.ex.sbm.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Set;
@Data
@ApiModel
public class UserQO implements Serializable {

    @ApiModelProperty(name = "ids")
    private Set<Long> ids;

    @ApiModelProperty(name = "names")
    private Set<String> names;
}
