package th.co.cbank.util;

import java.awt.Component;
import java.awt.Container;

public class ComponentUtil {

    public static void enableComponents(Container container, boolean enable) {
        Component[] components = container.getComponents();
        for (Component component : components) {
            component.setEnabled(enable);
            if (component instanceof Container) {
                enableComponents((Container) component, enable);
            }
        }
    }
}
