# Plugin Template for Xed-Editor (Karbon)

This project serves as a template for creating plugins for **Xed-Editor (Karbon)**.

## Setup

Follow these steps to set up the repository and build your plugin:

### 1. Clone the Repository

Start by cloning this repository and navigating into its directory:

```bash
git clone https://github.com/Xed-Editor/pluginTemplate
cd pluginTemplate
mkdir -p pluginTemplate/sdk
```

### 2. Download the SDK

1. Download the latest **`xed-editor-sdk.jar`** from the [GitHub Actions](https://github.com/RohitKushvaha01/pluginTemplate).  
   **Note**: Ensure the SDK version matches the release version of Xed-Editor you are targeting.  

2. Place the downloaded **`xed-editor-sdk.jar`** file into the `sdk` directory of your repository.

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
