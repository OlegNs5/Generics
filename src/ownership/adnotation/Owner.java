package ownership.adnotation;

import ownership.OwnerType;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * In adnotari putem sa folosim de urmatoarele tipuri;
 * a.Un tip de data primitiv
 * b.String
 * c.Clasa sau o invocare a unei clase
 * d.un tip enumerat sau un enum
 * e.o alta adnotare
 * f.un array din cele de mai sus
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Owners.class)
public @interface Owner {
    String ownerName();
    OwnerType ownerType();
}
