package com.es;

import com.openpojo.reflection.filters.FilterPackageInfo;
import com.openpojo.validation.Validator;
import com.openpojo.validation.ValidatorBuilder;
import com.openpojo.validation.rule.impl.GetterMustExistRule;
import com.openpojo.validation.test.impl.GetterTester;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class QueueTest {

  @Test
  public void equalsContract() {
    EqualsVerifier.forClass(Queue.class)
        .withNonnullFields("persons")
        .verify();
  }

  @Test
  public void testPojoStructureAndBehavior() {
    Validator validator = ValidatorBuilder.create()
        // Add Rules to validate structure for POJO_PACKAGE
        // See com.openpojo.validation.rule.impl for more ...
        .with(new GetterMustExistRule())
        // Add Testers to validate behaviour for POJO_PACKAGE
        // See com.openpojo.validation.test.impl for more ...
        .with(new GetterTester())
        .build();

    validator.validate("com.es", new FilterPackageInfo());
  }
}
