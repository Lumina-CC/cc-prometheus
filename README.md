# CC Prometheus Exporter
Exposes [Prometheus] metrics for [CC: Tweaked]. This provides the following metrics:

 - Total number of computers.
 - Total number of on computers.
 - Per-computer breakdown of all fields in `/computercraft profile`, including:
   - Time taken on the computer thread.
   - Time taken on the server thread.
   - HTTP usage (bandwidth, number of requests).
 - Number of threads in CC's underlying thread groups.

We also provide several non-CC related exporters, which are disabled by default. These are not designed to be
comprehensive (better monitoring solutions exist!) but are useful when you only need some basic monitoring and are
already running this.

 - All standard JVM metrics (memory, GC, thread counts).
 - Basic statistics about Minecraft:
   - Player count (total and per-dimension).
   - Chunks loaded per-dimension.
   - TPS (rolling average and as a histogram).

## Usage
Download the mod from the releases page and drop it into your `mods/` folder.

Start your server, metrics are available at <http://127.0.0.1:9226/metrics>. This can be configured with the config
file, located at `<server_root>/serverconfig/ccprometheus.toml`.

## Credits
[SquidDev] for the original mod

[Prometheus]: https://prometheus.io/
[CC: Tweaked]: https://github.com/cc-tweaked/CC-Tweaked
[SquidDev]: https://github.com/squiddev-cc