package org.citydb.ade.model;

import org.citygml4j.builder.copy.CopyBuilder;
import org.citygml4j.model.citygml.ade.binding.ADEGenericApplicationProperty;

public class StreetProperty extends ADEGenericApplicationProperty<String> {

    private StreetProperty() {
    }

    public StreetProperty(String value) {
        super(value);
    }

    @Override
    public Object copy(CopyBuilder copyBuilder) {
        return copyTo(new StreetProperty(), copyBuilder);
    }
}