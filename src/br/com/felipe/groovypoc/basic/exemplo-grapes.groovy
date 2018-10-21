package br.com.felipe.groovypoc.basic

import org.apache.commons.lang3.text.WordUtils

@Grapes(
    @Grab(group = 'org.apache.commons',module = 'commons-lang3',version = '3.4')
)

String name = "Felipe Santaniello"
WordUtils wordUtils = new WordUtils()

println wordUtils.initials(name)
