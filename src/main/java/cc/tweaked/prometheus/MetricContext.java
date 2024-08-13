package cc.tweaked.prometheus;

import io.prometheus.client.CollectorRegistry;
import net.minecraft.server.MinecraftServer;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

/**
 * Represents a context metrics are gathered under.
 *
 * @param server   The currently running server.
 * @param registry The registry metrics should be submitted to.
 * @param onTick   Add an action which will be called each server tick.
 */
public record MetricContext(
    MinecraftServer server,
    CollectorRegistry registry,
    Consumer<Runnable> onTick
) {
    public void onTick(@NotNull Runnable action) {
        onTick().accept(action);
    }
}
