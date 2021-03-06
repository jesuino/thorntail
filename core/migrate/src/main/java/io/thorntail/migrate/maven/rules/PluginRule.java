package io.thorntail.migrate.maven.rules;

import java.util.Collections;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import io.thorntail.migrate.maven.ModelAction;
import io.thorntail.migrate.maven.ModelRule;
import org.apache.maven.model.Model;
import org.apache.maven.model.Plugin;

/**
 * Created by bob on 3/13/18.
 */
@ApplicationScoped
public class PluginRule implements ModelRule {
    @Override
    public List<? extends ModelAction> match(Model context) {
        if ( context.getBuild() != null && context.getBuild().getPlugins() != null ) {
            for (Plugin plugin : context.getBuild().getPlugins()) {
                if (plugin.getGroupId().equals("org.wildfly.swarm") && plugin.getArtifactId().equals("wildfly-swarm-plugin")) {
                    return Collections.singletonList(new PluginAction(this, plugin));
                }
            }
        }

        return Collections.emptyList();
    }
}
