# Hydra Samsung SM-X400 kiosk lane

This branch turns YagniLauncher into an optional Samsung front-door for the Hydra/KAI 9000 stack without giving the launcher shell, Shizuku, or root privileges.

## Typed actions

The launcher accepts these explicit Android actions:

- `art.eggiebagelface.hydra.action.OPEN_COCKPIT`
- `art.eggiebagelface.hydra.action.OPEN_TERMUX`
- `art.eggiebagelface.hydra.action.OPEN_SHIZUKU`
- `art.eggiebagelface.hydra.action.OPEN_TERMUX_X11`

Examples from ADB/Termux:

```bash
am start -a art.eggiebagelface.hydra.action.OPEN_COCKPIT
am start -a art.eggiebagelface.hydra.action.OPEN_TERMUX
am start -a art.eggiebagelface.hydra.action.OPEN_SHIZUKU
am start -a art.eggiebagelface.hydra.action.OPEN_TERMUX_X11
```

Cockpit resolves to `http://127.0.0.1:8787/`. Companion-app targets use their normal launch activities and fail closed if the app is absent.

## Security boundary

- launcher does not execute shell commands
- launcher does not request Shizuku authorization
- launcher does not auto-select root/Sui
- stock/Knox target remains the trusted Samsung lane
- root/Sui remains a separate laboratory target
- localhost cockpit stays the stable local interface
