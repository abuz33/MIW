package com.springboot;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "Pet Model Object", description = "Pet Model Object to use in this application" )
public class Pet {

    @ApiModelProperty(value = "Id of pet object")
    private int id;

    @ApiModelProperty(value = "Name of pet object")
    private String name;

    @ApiModelProperty(value = "Date of pet object")
    private Date date;
}
