package com.tpointtech.io.objectstream;

import java.io.ObjectStreamClass;
import java.io.ObjectStreamField;
import java.io.Serializable;

public class ObjectStreamClassDemo {
    static void main() {
        // ObjectStream class is a special class used internally
        //      by Java serialization, and it is used to store metadata
        //      of a class such as its name, fields and serialVersionUID

        class Phone implements Serializable {
            String name;
            double price;
            boolean isNew;
        }

        ObjectStreamClass osc = ObjectStreamClass.lookup(Phone.class);

        ObjectStreamField isNewField = osc.getField("isNew");
        System.out.println(isNewField.getTypeString());
        System.out.println(isNewField.isPrimitive());

        ObjectStreamField price = new ObjectStreamField("price", Double.class);
        System.out.println(price.getType());
        System.out.println(price.isPrimitive());
        System.out.println(price.getTypeCode());
    }
}
