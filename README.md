<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/jgoerner/t-47-procedures">
    <img src="images/logo.png" alt="Logo" width="80" height="80">
  </a>

  <h3 align="center">T-47 Airspeeder Neo4j Procedures</h3>

  <p align="center">
    Custom Neo4j Procedures for <a href="https://github.com/jgoerner/t-47">T-47</a>
    <br />
    <br />
    <!--a href=""-->View Demo<!--/a-->
    ·
    <a href="https://github.com/jgoerner/t-47-procedures/issues">Report Bug</a>
    ·
    <a href="https://github.com/jgoerner/t-47-procedures/issues">Request Feature</a>
  </p>
</p>



<!-- TABLE OF CONTENTS -->
## Table of Contents

* [About the Project](#about-the-project)
  * [Built With](#built-with)
* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
  * [Installation](#installation)
* [Usage](#usage)
* [Roadmap](#roadmap)
* [Contributing](#contributing)
* [License](#license)
* [Contact](#contact)
* [Acknowledgements](#acknowledgements)



<!-- ABOUT THE PROJECT -->
## About The Project

![about](images/about.gif)

This repository is a little add-on to [jgoerner/t-47](https://github.com/jgoerner/t-47/) to provide custom Neo4j functionality, such as initial data loading.
See the [release section](https://github.com/jgoerner/t-47-procedures/releases) for an overview about different versions.

### Built With
* [Neo4j](https://neo4j.com/)
* [Maven](https://maven.apache.org/)



<!-- GETTING STARTED -->
## Getting Started

You can use the procedures inside of this repository on any Neo4j instance of your choince (theoretically).
However the provided functions are specificly targeted for [jgoerner/t-47](https://github.com/jgoerner/t-47/).

### Prerequisites

[Neo4j procedures](https://neo4j.com/developer/java/#neo4j-java) requires JDK8. 

### Installation

Simply clone this repository.

<!-- USAGE EXAMPLES -->
## Usage

1. Run `mvn test` to ensure everything works
2. Run `mvn clean package` to bundle the procedures into a jar
3. Put the resulting jar into the `/plugins` directory of your Neo4j instance



<!-- ROADMAP -->
## Roadmap

See the [open issues](https://github.com/jgoerner/t-47-procedures/issues) for a list of proposed features (and known issues).



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.



<!-- CONTACT -->
## Contact

Joshua Görner - [jgoerner](https://www.linkedin.com/in/jgoerner/) - joshua.goerner[at]gmail.com



<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements
* [O. Drew](https://github.com/othneildrew/Best-README-Template) - nice GH Readme template
