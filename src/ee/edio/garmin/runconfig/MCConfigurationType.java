package ee.edio.garmin.runconfig;

import com.intellij.execution.configuration.ConfigurationFactoryEx;
import com.intellij.execution.configurations.ConfigurationTypeBase;
import com.intellij.execution.configurations.ConfigurationTypeUtil;
import com.intellij.execution.configurations.ModuleBasedConfiguration;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.project.Project;
import ee.edio.garmin.MonkeyCIcons;
import org.jetbrains.annotations.NotNull;

public class MCConfigurationType extends ConfigurationTypeBase {
  protected MCConfigurationType() {
    // icon is 16 (default for java is AllIcons.RunConfigurations.Application)
    super("MonkeyCApplication", "Monkey C Application", "Configuration to run a Connect IQ app with the simulator", MonkeyCIcons.MODULE16);


    addFactory(new ConfigurationFactoryEx(this) {
      @Override
      public void onNewConfigurationCreated(@NotNull RunConfiguration configuration) {
        final ModuleBasedConfiguration moduleBasedConfiguration = (ModuleBasedConfiguration) configuration;
        moduleBasedConfiguration.onNewConfigurationCreated();
      }

      public RunConfiguration createTemplateConfiguration(Project project) {
        return new MCModuleBasedConfiguration("", new MCRunConfigurationModule(project), this);
      }
    });
  }

  @NotNull
  public static MCConfigurationType getInstance() {
    return ConfigurationTypeUtil.findConfigurationType(MCConfigurationType.class);
    //return Extensions.findExtension(CONFIGURATION_TYPE_EP, MCConfigurationType.class);
  }
}