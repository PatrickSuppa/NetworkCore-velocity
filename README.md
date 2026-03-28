# Minecraft Network Core (Velocity)

## Overview
This project is a complete network core for a Minecraft Java server using Velocity as a proxy.  
It includes centralized configuration, proxy-side logic, and integration hooks for common plugins.

## Architecture
- Proxy: Velocity
- Backend: Paper servers
- Permissions: LuckPerms
- Placeholders: PlaceholderAPI (backend)
- Leaderboards: database-based system (custom or external)

## Features
- Centralized configuration system
- Player connection handling
- Automatic server routing
- Integration layer for permissions and data systems
- Modular design for scalability

## Project Structure
network-core/
│── proxy-plugin/
│   ├── src/
│   ├── resources/
│   │   ├── config.yml
│   │   ├── messages.yml
│   │   ├── servers.yml
## Configuration
All configuration is handled inside the plugin:
- config.yml: core settings
- messages.yml: messages
- servers.yml: server definitions

## Skills Demonstrated
- Java backend development
- Proxy systems (Velocity)
- Configuration architecture
- Plugin modularization
- Integration with external plugins

## Contact
- GitHub: PatrickSuppa
- Discord: Bearilol
- Email: patrick@patrickbet.com
