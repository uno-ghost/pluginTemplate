# Plugin Template for Xed-Editor

This project serves as a template for creating plugins for **Xed-Editor (Karbon)**.

## Setup

Follow these steps to set up the repository and build your plugin:

### 1. Clone the Repository

Start by cloning this repository and navigating into its directory:

```bash
git clone https://github.com/Xed-Editor/pluginTemplate
cd pluginTemplate
mkdir -p sdk
```

### 2. Download the SDK

1. Download the latest **`xed-editor-sdk.jar`** from the [GitHub actions](https://github.com/Xed-Editor/Xed-Editor-Sdk/actions).  

   **Note**: If certain APIs or Classes are not available in your plugin then just update the SDK jar. 

2. Unzip it and Place the downloaded **`xed-editor-sdk.jar`** file into the `sdk` directory of your repository.

### 3. Build the Plugin

Run the following Gradle command to build your plugin:

```bash
bash build.sh
```

### 4. Locate the Build Output

After a successful build, your plugin will be available at:

```
output/
```
