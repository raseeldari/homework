import java.io.File;
import java.io.IOException;

public class ShellCommandHandler {
    private File currentDirectory;

    public ShellCommandHandler() {
        // Initialize currentDirectory to the user's current working directory
        this.currentDirectory = new File(System.getProperty("user.dir"));
    }

    public void printWorkingDirectory() {
        // Print the absolute path of the current directory
        System.out.println(currentDirectory.getAbsolutePath());
    }

    public void listDirectory() {
        // List all files and directories in the current directory
        File[] files = currentDirectory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("[DIR] " + file.getName());
                } else {
                    System.out.println("[FILE] " + file.getName());
                }
            }
        } else {
            System.out.println("No files found.");
        }
    }

    public void changeDirectory(String name) {
        // Implement the change directory command
        if (name == null || name.isEmpty()) {
            System.out.println("Usage: cd [directory_name]");
            return;
        }

        File newDir;
        if (name.equals("..")) {
            newDir = currentDirectory.getParentFile();
        } else {
            newDir = new File(currentDirectory, name);
        }

        if (newDir != null && newDir.isDirectory()) {
            currentDirectory = newDir;
        } else {
            System.out.println("Directory not found: " + name);
        }
    }

    public void makeDirectory(String name) {
        // Implement the make directory command
        if (name == null || name.isEmpty()) {
            System.out.println("Usage: mkdir [directory_name]");
            return;
        }

        File newDir = new File(currentDirectory, name);
        if (newDir.exists()) {
            System.out.println("Directory already exists.");
        } else if (newDir.mkdir()) {
            System.out.println("Directory created: " + name);
        } else {
            System.out.println("Failed to create directory.");
        }
    }

    public void createFile(String name) {
        // Implement the create file command
        if (name == null || name.isEmpty()) {
            System.out.println("Usage: touch [file_name]");
            return;
        }

        File newFile = new File(currentDirectory, name);
        if (newFile.exists()) {
            System.out.println("File already exists.");
        } else {
            try {
                if (newFile.createNewFile()) {
                    System.out.println("File created: " + name);
                } else {
                    System.out.println("Failed to create file: " + name);
                }
            } catch (IOException e) {
                System.out.println("Error creating file: " + e.getMessage());
            }
        }
    }

    public void printHelp() {
        // Implement help command to print information about all available commands
        System.out.println("Available commands:");
        System.out.println("pwd          - Print working directory");
        System.out.println("ls           - List files and directories");
        System.out.println("cd [name]    - Change directory");
        System.out.println("mkdir [name] - Create a new directory");
        System.out.println("touch [name] - Create a new file");
        System.out.println("help         - Show this help message");
        System.out.println("exit         - Exit the shell");
    }

    public File getCurrentDirectory() {
        // Return the current directory
        return currentDirectory;
    }
}
