package com.load.files.client.repository.implents;

import com.load.files.client.repository.interfaces.IFileRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class FileRepository implements IFileRepository {

    Logger logger = LoggerFactory.getLogger(FileRepository.class);

    @Override
    public List<String> readAllLines(String path) throws IOException {

        Path pathFile = Paths.get(path);

        var lines = Files.readAllLines(pathFile, Charset.forName("cp1252"));

        logger.info("Readed:: "+pathFile.getFileName()+" Lines: "+lines.stream().count());

        return  lines;
    }

    @Override
    public List<File> GetAllFiles(String path){
        List<File> files;

        try {
            files = Files.list(Paths.get(path))
                    .filter(Files::isRegularFile)
                    .map(Path::toFile)
                    .filter(c-> c.getName().endsWith(".TXT"))
                    .collect(Collectors.toList());

            return files;

        } catch (IOException e) {
            return  files = new ArrayList<>();
        }
    }
}
