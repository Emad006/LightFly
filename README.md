# LightFly
LightFly is a simple lightweight Spigot flight plugin which requires little to no
configuration to set up. This plugin is a replacement for [EssentialX](https://essentialsx.net/) fly,
and is useful if you don't want to install [EssentialX](https://essentialsx.net/) on your server.

## Disclaimer
This plugin is still in development. The source code is public, but the `.jar` file is not.
You can compile the plugin from the source code if you want for now.
I will release the plugin after I'm done fully testing it.

## Compatibility
This plugin is currently compatible with Minecraft 1.17, however,
other versions that use the same Spigot API should _technically_ work.
I will soon test out the plugin in different Minecraft Versions and list
the versions LightFly is compatible with.

## Permissions
- `lightfly.fly` allows a user to fly.
- `lightfly.others` allows a user to let others fly.
- `light.nofall` disable fall damage completely.

### Note
When a user flying disables flight mid-air, they will fall down and take damage.
Unfortunately, this is pure vanilla behavior and cannot be changed.
You can however, assign a player the `light.nofall` permission which completely
disables fall damage for that user. The user will not take any fall damage at all.