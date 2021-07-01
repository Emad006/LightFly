# LightFly
LightFly is a simple lightweight Spigot flight plugin which requires little to no
configuration to set up. This plugin is a replacement for [EssentialX](https://essentialsx.net/) fly,
and is useful if you don't want to install [EssentialX](https://essentialsx.net/) on your server.

## Compatibility
This plugin is currently compatible with Minecraft 1.17, however,
other versions that use the same Spigot API should _technically_ work.
I will soon test out the plugin in different Minecraft Versions and list
the versions LightFly is compatible with.

## Installation
Installation of the plugin is straight forward and is similar to rest of the
other plugins. Simply drag and drop the appropriate version of
`.jar` file into your server's `plugin`
folder. No configuration required, and the plugin will not create a folder or
any sort of configuration files such as `config.yml`.

## Permissions
- `lightfly.fly` allows a user to fly.
- `lightfly.others` allows a user to let others fly.
- `light.nofall` disable fall damage completely.

## Support
If you come across a bug or an unexpected behavior, please open a [GitHub Issue](https://github.com/XyroPhyte/LightFly/issues)
or join the [Discord Server](https://discord.gg/MmqXcebnxC) and let me know about it. Please make sure
to include how to reproduce the bug or the issue.

Also, if you want me to make minor modifications for you, such as
disabling the `Disable Flight OnJoin` completely, feel free to let me know by joining
the [Discord Server](https://discord.gg/MmqXcebnxC). I will try my best to compile a custom `.jar` for you.
I will also provide you the source code if you want.

### Note
When a user flying disables flight mid-air, they will fall down and take damage.
Unfortunately, this is pure vanilla behavior and cannot be changed.
You can however, assign a player the `light.nofall` permission which completely
disables fall damage for that user. The user will not take any fall damage at all.
Also, upon joining, the player's flight is set to off. The player have to
manually re-enable their flight if they had it turned on when they left the server.