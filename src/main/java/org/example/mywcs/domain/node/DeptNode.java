package org.example.mywcs.domain.node;

import lombok.Data;
import org.example.mywcs.domain.WcsDept;

import java.util.List;

/**
 * @Author：hb
 * @Package：org.example.mywcs.domain.node
 * @Project：my-wcs
 * @Date：27/11/2024 11:33 am
 */
@Data
public class DeptNode extends WcsDept {
    List<DeptNode> children;
}
