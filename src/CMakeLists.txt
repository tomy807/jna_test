include(GNUInstallDirs)

add_library(jnalsw SHARED calculator.cpp)

set_target_properties(jnalsw PROPERTIES
        PUBLIC_HEADER ${CMAKE_SOURCE_DIR}/include/calculator.h)

include_directories(${CMAKE_SOURCE_DIR}/include/)
install(TARGETS jnalsw
        LIBRARY DESTINATION ${CMAKE_INSTALL_LIBDIR}
    	PUBLIC_HEADER DESTINATION ${CMAKE_INSTALL_INCLUDEDIR} )
