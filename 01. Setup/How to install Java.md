# ☕ Java 25 Installation Process on Ubuntu 24.04

## 🧩 Step 1: Update System

```bash
sudo apt update && sudo apt upgrade -y
```

---

## ☕ Step 2: Download JDK 25 (.deb file)

Go to the official Oracle Java 25 download page:
[Oracle JDK 25 Downloads](https://www.oracle.com/java/technologies/downloads/)

Select:

* **Operating System:** Linux
* **Package:** `.deb (Debian Package)`

Move the file to your `Downloads` folder.

---

## ⚙️ Step 3: Install JDK 25 using dpkg

```bash
cd ~/Downloads
sudo dpkg -i jdk-25_linux-x64_bin.deb
```

✅ During installation, `update-alternatives` automatically configures `java`, `javac`, and other binaries.

---

## 🔍 Step 4: Verify Installation

```bash
java -version
```

Expected output:

```
java version "25" 2025-09-16 LTS
Java(TM) SE Runtime Environment (build 25+37-LTS-3491)
Java HotSpot(TM) 64-Bit Server VM (build 25+37-LTS-3491, mixed mode, sharing)
```

---

## 🧭 Step 5: Set `JAVA_HOME` (Optional but Recommended)

```bash
echo 'export JAVA_HOME=/usr/lib/jvm/jdk-25-oracle-x64' | sudo tee -a /etc/environment
source /etc/environment
echo $JAVA_HOME
```

---

## 🧠 Step 6: Verify Compiler

```bash
javac -version
```

Output should be:

```
javac 25
```

---

## ⚙️ Step 7: Configure IDEs

### 🖥 VS Code

1. Install **Extension Pack for Java**
2. Run `Java: Configure Java Runtime` → Add `/usr/lib/jvm/jdk-25-oracle-x64`
3. (Optional) Add to settings.json:

```json
"java.home": "/usr/lib/jvm/jdk-25-oracle-x64"
```

### 💻 IntelliJ IDEA

1. Go to `File → Project Structure → SDKs → Add JDK`
2. Select path: `/usr/lib/jvm/jdk-25-oracle-x64`
3. Set Project SDK and language level to **25**

---

## ✅ Step 8: Test Java

Create `Hello.java`:

```bash
echo 'public class Hello { public static void main(String[] args){ System.out.println("Hello, Java 25!"); } }' > Hello.java
javac Hello.java
java Hello
```

Output:

```
Hello, Java 25!
```

---

## 🚀 Done!

You have successfully installed **Oracle JDK 25** and set it up for **VS Code / IntelliJ** on Ubuntu 🎉
