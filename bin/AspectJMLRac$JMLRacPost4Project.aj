import org.aspectjml.ajmlrac.runtime.*;
public privileged aspect AspectJMLRac$JMLRacPost4Project {

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final petclinic.Appointment object$rac): (execution( * petclinic.Appointment..*+.*(..))
          || execution(petclinic.Appointment..*+.new(..))
          || execution( * petclinic.Appointment+.*(..))
          || execution(petclinic.Appointment+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * petclinic.Appointment..*+.*(..))
          || execution(petclinic.Appointment..*+.new(..))
          || execution( * petclinic.Appointment+.*(..))
          || execution(petclinic.Appointment+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final petclinic.Pet object$rac): (execution( * petclinic.Pet..*+.*(..))
          || execution(petclinic.Pet..*+.new(..))
          || execution( * petclinic.Pet+.*(..))
          || execution(petclinic.Pet+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * petclinic.Pet..*+.*(..))
          || execution(petclinic.Pet..*+.new(..))
          || execution( * petclinic.Pet+.*(..))
          || execution(petclinic.Pet+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final petclinic.PetClinic object$rac): (execution( * petclinic.PetClinic..*+.*(..))
          || execution(petclinic.PetClinic..*+.new(..))
          || execution( * petclinic.PetClinic+.*(..))
          || execution(petclinic.PetClinic+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * petclinic.PetClinic..*+.*(..))
          || execution(petclinic.PetClinic..*+.new(..))
          || execution( * petclinic.PetClinic+.*(..))
          || execution(petclinic.PetClinic+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final petclinic.PetController object$rac): (execution( * petclinic.PetController..*+.*(..))
          || execution(petclinic.PetController..*+.new(..))
          || execution( * petclinic.PetController+.*(..))
          || execution(petclinic.PetController+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * petclinic.PetController..*+.*(..))
          || execution(petclinic.PetController..*+.new(..))
          || execution( * petclinic.PetController+.*(..))
          || execution(petclinic.PetController+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final petclinic.Vet object$rac): (execution( * petclinic.Vet..*+.*(..))
          || execution(petclinic.Vet..*+.new(..))
          || execution( * petclinic.Vet+.*(..))
          || execution(petclinic.Vet+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * petclinic.Vet..*+.*(..))
          || execution(petclinic.Vet..*+.new(..))
          || execution( * petclinic.Vet+.*(..))
          || execution(petclinic.Vet+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

/** Generated by AspectJML to enable modular signals_only checking (XCS enabled) */
  after(final petclinic.VetController object$rac): (execution( * petclinic.VetController..*+.*(..))
          || execution(petclinic.VetController..*+.new(..))
          || execution( * petclinic.VetController+.*(..))
          || execution(petclinic.VetController+.new(..))) && 
   this(object$rac) {
   JMLChecker.hasAnyThrownExceptionalPostconditionSignalsOnly();
  }

/** Generated by AspectJML to enhance error reporting (Execution Site enabled) */
  after() throwing (Throwable rac$e): (execution( * petclinic.VetController..*+.*(..))
          || execution(petclinic.VetController..*+.new(..))
          || execution( * petclinic.VetController+.*(..))
          || execution(petclinic.VetController+.new(..))){
    JMLChecker.hideAjmlSpecificStackTrace(rac$e);
    JMLChecker.rethrowJMLAssertionError(rac$e);
  }

}