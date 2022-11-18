package io.pplenty.upload.service

import org.springframework.stereotype.Service
import org.springframework.util.FileCopyUtils
import org.springframework.web.multipart.MultipartFile
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

@Service
class Uploader {

    @Throws(InterruptedException::class, IOException::class)
    fun process(file: MultipartFile) {
        val initialStream = file.inputStream
        val buffer = ByteArray(initialStream.available())
        initialStream.read(buffer)
        val output = FileOutputStream(File("/Users/kakao/dev/test/target.tmp"))

        FileCopyUtils.copy(initialStream, output)
    }
}
