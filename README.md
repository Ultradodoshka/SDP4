# Media Conversion Facade (Option A)

Implementation of the Facade structural design pattern in Java (JDK 17)

## Project Overview
The project simulates a multi-step media conversion subsystem and simplifies client interaction using `MediaConversionFacade`.

### Subsystem Components
- `VideoFile`: Represents media file and its data buffer.
- `MetadataReader`: Extracts file metadata and extension.
- `CodecFactory`, `Codec` (`MPEG4CompressionCodec`, `OGGCompressionCodec`): Resolves and provides target compression codecs.
- `BitrateReader`: Reads, buffers, and encodes data streams.
- `AudioMixer`: Normalizes and fixes audio tracks.
- `MediaConversionFacade`: Orchestrates subsystem steps via a single method `convert(fileName, targetFormat)`.

## Project Structure
```text
src/
└── media/
    ├── Main.java
    ├── VideoFile.java
    ├── facade/
    │   └── MediaConversionFacade.java
    └── subsystem/
        ├── AudioMixer.java
        ├── BitrateReader.java
        ├── Codec.java
        ├── CodecFactory.java
        ├── MPEG4CompressionCodec.java
        ├── MetadataReader.java
        └── OGGCompressionCodec.java
```
### How to run
````bash
javac -d out src/media/*.java src/media/facade/*.java src/media/subsystem/*.java
