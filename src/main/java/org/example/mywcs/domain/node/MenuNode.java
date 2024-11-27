package org.example.mywcs.domain.node;

import lombok.Data;
import org.apache.catalina.LifecycleState;
import org.example.mywcs.domain.WcsMenu;

import java.util.List;

/**
 * @Author：hb
 * @Package：org.example.mywcs.domain.node
 * @Project：my-wcs
 * @Date：26/11/2024 4:08 pm
 */
@Data
public class MenuNode extends WcsMenu {
    List<MenuNode> children ;
}
