package br.com.danieldias.model;

import org.bson.types.ObjectId;
import org.jnosql.artemis.AttributeConverter;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
public class ObjectIdConverter implements AttributeConverter<String, ObjectId> {

    @Override
    public ObjectId convertToDatabaseColumn(String attribute) {
        if(attribute == null) {
            return null;
        }
        return new ObjectId(attribute);
    }

    @Override
    public String convertToEntityAttribute(ObjectId dbData) {
        if(dbData == null) {
            return null;
        }
        return dbData.toString();
    }
}
