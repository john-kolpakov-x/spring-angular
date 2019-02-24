package kz.pompei.springAngular.register.importers;

import kz.pompei.springAngular.controller.controller.ImporterController;
import kz.pompei.springAngular.register.impl.ImporterRegister;
import org.springframework.context.annotation.Import;

@Import({ImporterController.class, ImporterRegister.class})
public class ImporterProduct {}
