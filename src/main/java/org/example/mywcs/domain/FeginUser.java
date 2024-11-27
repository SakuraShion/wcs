package org.example.mywcs.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

/**
 * @Author：hb
 * @Package：org.example.mywcs.domain
 * @Project：my-wcs
 * @Date：26/11/2024 3:02 pm
 */
@Data
public class FeginUser{
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    @JsonIgnore
    private String upass;
}
