# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.20

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Disable VCS-based implicit rules.
% : %,v

# Disable VCS-based implicit rules.
% : RCS/%

# Disable VCS-based implicit rules.
% : RCS/%,v

# Disable VCS-based implicit rules.
% : SCCS/s.%

# Disable VCS-based implicit rules.
% : s.%

.SUFFIXES: .hpux_make_needs_suffix_list

# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

#Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /cygdrive/c/Users/sachi/AppData/Local/JetBrains/CLion2021.2/cygwin_cmake/bin/cmake.exe

# The command to remove a file.
RM = /cygdrive/c/Users/sachi/AppData/Local/JetBrains/CLion2021.2/cygwin_cmake/bin/cmake.exe -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /cygdrive/c/Users/sachi/OneDrive/Desktop/mattkerrigan

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /cygdrive/c/Users/sachi/OneDrive/Desktop/mattkerrigan/cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/mattkerrigan.dir/depend.make
# Include the progress variables for this target.
include CMakeFiles/mattkerrigan.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/mattkerrigan.dir/flags.make

CMakeFiles/mattkerrigan.dir/MST.cpp.o: CMakeFiles/mattkerrigan.dir/flags.make
CMakeFiles/mattkerrigan.dir/MST.cpp.o: ../MST.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/cygdrive/c/Users/sachi/OneDrive/Desktop/mattkerrigan/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/mattkerrigan.dir/MST.cpp.o"
	/usr/bin/c++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/mattkerrigan.dir/MST.cpp.o -c /cygdrive/c/Users/sachi/OneDrive/Desktop/mattkerrigan/MST.cpp

CMakeFiles/mattkerrigan.dir/MST.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/mattkerrigan.dir/MST.cpp.i"
	/usr/bin/c++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /cygdrive/c/Users/sachi/OneDrive/Desktop/mattkerrigan/MST.cpp > CMakeFiles/mattkerrigan.dir/MST.cpp.i

CMakeFiles/mattkerrigan.dir/MST.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/mattkerrigan.dir/MST.cpp.s"
	/usr/bin/c++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /cygdrive/c/Users/sachi/OneDrive/Desktop/mattkerrigan/MST.cpp -o CMakeFiles/mattkerrigan.dir/MST.cpp.s

# Object files for target mattkerrigan
mattkerrigan_OBJECTS = \
"CMakeFiles/mattkerrigan.dir/MST.cpp.o"

# External object files for target mattkerrigan
mattkerrigan_EXTERNAL_OBJECTS =

mattkerrigan.exe: CMakeFiles/mattkerrigan.dir/MST.cpp.o
mattkerrigan.exe: CMakeFiles/mattkerrigan.dir/build.make
mattkerrigan.exe: CMakeFiles/mattkerrigan.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/cygdrive/c/Users/sachi/OneDrive/Desktop/mattkerrigan/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable mattkerrigan.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/mattkerrigan.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/mattkerrigan.dir/build: mattkerrigan.exe
.PHONY : CMakeFiles/mattkerrigan.dir/build

CMakeFiles/mattkerrigan.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/mattkerrigan.dir/cmake_clean.cmake
.PHONY : CMakeFiles/mattkerrigan.dir/clean

CMakeFiles/mattkerrigan.dir/depend:
	cd /cygdrive/c/Users/sachi/OneDrive/Desktop/mattkerrigan/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /cygdrive/c/Users/sachi/OneDrive/Desktop/mattkerrigan /cygdrive/c/Users/sachi/OneDrive/Desktop/mattkerrigan /cygdrive/c/Users/sachi/OneDrive/Desktop/mattkerrigan/cmake-build-debug /cygdrive/c/Users/sachi/OneDrive/Desktop/mattkerrigan/cmake-build-debug /cygdrive/c/Users/sachi/OneDrive/Desktop/mattkerrigan/cmake-build-debug/CMakeFiles/mattkerrigan.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/mattkerrigan.dir/depend
