(ns net.wikipunk.rdf.lcc-cr
  "The purpose of the Country Representation ontology, based on ISO 3166 and other representations of geographic regions and countries, such as the ISO Online Browsing Platform, UN M49 Region codes, SWIFT registry, UN FAO and CIA World Factbook, FIPA and International Olympics codes for countries, and GeoNames, is to provide a systematic description of the vocabulary used for country and geopolitical entity representation (based strictly on requirements for business applications, not broader geographic or political uses). A few additional properties to support geophysical coordinates, identified in the UN FAO and CIA World Factbook as well as from the well-known GeoNames ontology, have been added, but extensions to support other coding systems, such as the FAOSTAT code, have not been included. ISO 3166 provides widely, though not universally, applicable coded representations of names of countries, dependencies, and other areas of particular geopolitical interest and their subdivisions. - ISO 3166-1 (Country codes) establishes codes that represent the current names of countries, dependencies, and other areas of particular geopolitical interest, on the basis of lists of country names obtained from the United Nations. - ISO 3166-2 (Country subdivision code) establishes a code that represents the names of the principal administrative divisions, or similar areas, of the countries, etc. included in the ISO 3166-1. - ISO 3166-3 (Code for formerly used names of countries) establishes a code that represents non-current country names, i.e., the country names deleted from ISO 3166 since its first publication in 1974. The United Nations Standard Country or Area Codes for Statistical Use (M49), described at https://unstats.un.org/unsd/methodology/m49/, provides further regional classification for countries by continent, region within a continent, and sub-regions within regions that are widely used as well, and so this ontology is designed to support the M49 code set as well. M49 reuses the ISO 3166 codes for countries and some regions, and augments that with additional, broader regional codes. This ontology provides a reference model to support the first two parts of ISO 3166, along with the other coding systems mentioned above."
  {:cmns-av/copyright ["Copyright (c) 2015-2022 Thematix Partners LLC"
                       "Copyright (c) 2015-2022 Object Management Group, Inc."
                       "Copyright (c) 2015-2019 Adaptive, Inc."
                       "Copyright (c) 2015-2017 Unisys"
                       "Copyright (c) 2019-2022 agnos.ai UK Ltd."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/LCC/Countries/CountryRepresentation.rdf",
   :dcterms/abstract
   "The purpose of the Country Representation ontology, based on ISO 3166 and other representations of geographic regions and countries, such as the ISO Online Browsing Platform, UN M49 Region codes, SWIFT registry, UN FAO and CIA World Factbook, FIPA and International Olympics codes for countries, and GeoNames, is to provide a systematic description of the vocabulary used for country and geopolitical entity representation (based strictly on requirements for business applications, not broader geographic or political uses). A few additional properties to support geophysical coordinates, identified in the UN FAO and CIA World Factbook as well as from the well-known GeoNames ontology, have been added, but extensions to support other coding systems, such as the FAOSTAT code, have not been included.\n\nISO 3166 provides widely, though not universally, applicable coded representations of names of countries, dependencies, and other areas of particular geopolitical interest and their subdivisions.\n - ISO 3166-1 (Country codes) establishes codes that represent the current names of countries, dependencies, and other areas of particular geopolitical interest, on the basis of lists of country names obtained from the United Nations.\n - ISO 3166-2 (Country subdivision code) establishes a code that represents the names of the principal administrative divisions, or similar areas, of the countries, etc. included in the ISO 3166-1.\n - ISO 3166-3 (Code for formerly used names of countries) establishes a code that represents non-current country names, i.e., the country names deleted from ISO 3166 since its first publication in 1974.\n \nThe United Nations Standard Country or Area Codes for Statistical Use (M49), described at https://unstats.un.org/unsd/methodology/m49/, provides further regional classification for countries by continent, region within a continent, and sub-regions within regions that are widely used as well, and so this ontology is designed to support the M49 code set as well. M49 reuses the ISO 3166 codes for countries and some regions, and augments that with additional, broader regional codes.\n\nThis ontology provides a reference model to support the first two parts of ISO 3166, along with the other coding systems mentioned above.",
   :dcterms/contributor ["Elisa Kendall, Thematix Partners LLC"
                         "Pete Rivett, agnos.ai U.K. Ltd"],
   :dcterms/license "http://opensource.org/licenses/MIT",
   :dcterms/references
   ["ISO 3166-3 Codes for the representation of names of countries and their subdivisions- Part 3: Code for formerly used names of countries, First edition, 1998-03-01"
    "Food and Agriculture Organization of the United Nations, see http://www.fao.org/countryprofiles/en/"
    "ISO 3166-1 Codes for the representation of names of countries and their subdivisions- Part 1: Country codes, Second edition, 2006-11-15"
    "ISO 3166-2 Codes for the representation of names of countries and their subdivisions- Part 2: Country subdivision code, First edition, 1998-12-15"
    "http://www.w3.org/2004/02/skos/core#"
    "CIA World Factbook, see https://www.cia.gov/library/publications/the-world-factbook/"
    "Society for Worldwide Interbank Financial Telecommunication (SWIFT) Online Directories, see http://www.swift.com/bsl/index.faces"
    "http://purl.org/dc/terms/"
    "International Olympic Committee list of national committees and their representation, see https://www.olympic.org/national-olympic-committees"],
   :dcterms/source
   ["ISO 3166-1 Codes for the representation of names of countries and their subdivisions- Part 1: Country codes, Second edition, 2006-11-15"
    "ISO 3166-3 Codes for the representation of names of countries and their subdivisions- Part 3: Code for formerly used names of countries, First edition, 1998-03-01"
    "ISO 3166-2 Codes for the representation of names of countries and their subdivisions- Part 2: Country subdivision code, First edition, 1998-12-15"],
   :owl/imports
   ["https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/"
    "https://www.omg.org/spec/Commons/TextDatatype/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://www.omg.org/spec/Commons/ContextualDesignators/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://www.omg.org/spec/Commons/CodesAndCodeSets/"
    "https://www.omg.org/spec/Commons/Collections/"],
   :owl/versionIRI
   "https://www.omg.org/spec/LCC/20221101/Countries/CountryRepresentation/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cds" "https://www.omg.org/spec/Commons/CodesAndCodeSets/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-cxtdsg" "https://www.omg.org/spec/Commons/ContextualDesignators/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-txt" "https://www.omg.org/spec/Commons/TextDatatype/",
    "dcterms" "http://purl.org/dc/terms/",
    "lcc-cr" "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "lcc-lr" "https://www.omg.org/spec/LCC/Languages/LanguageRepresentation/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfa/prefix "lcc-cr",
   :rdfa/uri "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "Country and Subdivision Representation Ontology",
   :rdfs/seeAlso ["https://www.omg.org/spec/LCC/Countries/AboutCountries/"
                  "https://www.omg.org/spec/LCC/AboutLCC/"]})

(def Alpha2RegionCode
  "digraph representing a country or geographic region"
  {:db/ident :lcc-cr/Alpha2RegionCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "alpha-2 region code",
   :rdfs/subClassOf :lcc-cr/GeographicRegionIdentifier,
   :skos/definition "digraph representing a country or geographic region"})

(def Alpha3RegionCode
  "trigraph representing a country or geographic region"
  {:db/ident :lcc-cr/Alpha3RegionCode,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "alpha-3 region code",
   :rdfs/subClassOf :lcc-cr/GeographicRegionIdentifier,
   :skos/definition "trigraph representing a country or geographic region"})

(def CoordinateSystem
  "system that uses one or more numbers, or coordinates, to uniquely determine the position of a point or other geometric element on a planar or spherical surface"
  {:db/ident :lcc-cr/CoordinateSystem,
   :dcterms/source
   ["https://en.wikipedia.org/wiki/Coordinate_system"
    "http://edndoc.esri.com/arcsde/9.1/general_topics/what_coord_sys.htm"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "coordinate system",
   :rdfs/subClassOf :cmns-col/Arrangement,
   :skos/definition
   "system that uses one or more numbers, or coordinates, to uniquely determine the position of a point or other geometric element on a planar or spherical surface",
   :skos/note
   "Without a concise definition of the coordinate system used to represent a point, it is difficult to change to a new coordinate system. Changing coordinate systems is required when integrating data from different sources into a common coordinate system."})

(def Country
  "geopolitical entity representing a distinct territorial body or political entity or dependent territory"
  {:cmns-av/explanatoryNote
   "It may be an independent sovereign state or part of a larger state, as a non-sovereign or formerly sovereign political division, a physical territory with a government, or a geographic region associated with sets of previously independent or differently associated peoples with distinct political characteristics.",
   :db/ident :lcc-cr/Country,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "country",
   :rdfs/seeAlso
   ["https://en.wikipedia.org/wiki/Country"
    "https://datahelpdesk.worldbank.org/knowledgebase/articles/906519"
    "https://www.un.org/development/desa/dpad/wp-content/uploads/sites/45/2017wesp_annex_en.pdf"],
   :rdfs/subClassOf [{:owl/maxCardinality 1,
                      :owl/onProperty     :lcc-cr/hasFrenchShortName,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :lcc-cr/hasEnglishShortNameInCapitals,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :lcc-cr/hasEnglishFullName,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :lcc-cr/hasFrenchFullName,
                      :rdf/type           :owl/Restriction}
                     {:owl/allValuesFrom :lcc-lr/Language,
                      :owl/onProperty    :lcc-cr/usesAdministrativeLanguage,
                      :rdf/type          :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :lcc-cr/hasFrenchShortNameInCapitals,
                      :rdf/type           :owl/Restriction}
                     {:owl/maxCardinality 1,
                      :owl/onProperty     :lcc-cr/hasEnglishShortName,
                      :rdf/type           :owl/Restriction}
                     :lcc-cr/GeopoliticalEntity
                     {:owl/onDataRange :xsd/boolean,
                      :owl/onProperty  :lcc-cr/isIndependent,
                      :owl/qualifiedCardinality 1,
                      :rdf/type        :owl/Restriction}],
   :skos/definition
   "geopolitical entity representing a distinct territorial body or political entity or dependent territory"})

(def CountrySubdivision
  "geopolitical entity, typically a division of a country, dependency, or other area of special geopolitical interest related to a country or other geopolitical entity"
  {:db/ident :lcc-cr/CountrySubdivision,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "country subdivision",
   :rdfs/subClassOf [{:owl/onProperty     :cmns-cls/isClassifiedBy,
                      :owl/someValuesFrom :lcc-cr/GeographicRegionKind,
                      :rdf/type           :owl/Restriction}
                     :lcc-cr/GeopoliticalEntity],
   :skos/definition
   "geopolitical entity, typically a division of a country, dependency, or other area of special geopolitical interest related to a country or other geopolitical entity"})

(def GeographicCoordinateSystem
  "three-dimensional reference system that locates points on the Earth's surface"
  {:db/ident :lcc-cr/GeographicCoordinateSystem,
   :dcterms/source
   ["https://pubs.usgs.gov/circ/1983/0878b/report.pdf"
    "http://edndoc.esri.com/arcsde/9.1/general_topics/what_coord_sys.htm"],
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "geographic coordinate system",
   :rdfs/subClassOf :lcc-cr/CoordinateSystem,
   :skos/definition
   "three-dimensional reference system that locates points on the Earth's surface",
   :skos/example
   "The three most widely used systems for indicating point locations in the United States are (1) latitude and longitude [and optionally elevation], (2) Universal Transverse Mercator (UTM) system, and (3) State Plane Coordinate Systems (SPCS).",
   :skos/note
   "The unit of measure is usually decimal degrees. A point has two coordinate values, latitude and longitude. Latitude and longitude measure angles."})

(def GeographicRegion
  "area of land that has common features"
  {:db/ident :lcc-cr/GeographicRegion,
   :dcterms/source "https://www.nationalgeographic.org/encyclopedia/region/",
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "geographic region",
   :rdfs/subClassOf :lcc-cr/Region,
   :skos/definition "area of land that has common features",
   :skos/note
   "A region can be defined by natural or artificial features. For the purposes of LCC, a geographic region is describes part of a country or the world having definable characteristics but not always fixed boundaries."})

(def GeographicRegionIdentifier
  "string of letters assigned to a country or other geographic region for the purpose of uniquely identifying it"
  {:db/ident :lcc-cr/GeographicRegionIdentifier,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "geographic region identifier",
   :rdfs/subClassOf [{:owl/onProperty     :lcc-lr/hasTag,
                      :owl/someValuesFrom :xsd/string,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :cmns-id/identifies,
                      :owl/someValuesFrom :lcc-cr/GeographicRegion,
                      :rdf/type           :owl/Restriction}
                     :cmns-id/Identifier
                     :cmns-cds/CodeElement],
   :skos/definition
   "string of letters assigned to a country or other geographic region for the purpose of uniquely identifying it"})

(def GeographicRegionKind
  "classifier for a geographic region, including but not limited to a subdivision of a geopolitical entity, (noting that there may be more than one kind for a given country or other entity)"
  {:db/ident :lcc-cr/GeographicRegionKind,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "geographic region kind",
   :rdfs/subClassOf [{:owl/allValuesFrom :lcc-cr/GeographicRegion,
                      :owl/onProperty    :cmns-cls/classifies,
                      :rdf/type          :owl/Restriction}
                     :cmns-cls/Classifier],
   :skos/definition
   "classifier for a geographic region, including but not limited to a subdivision of a geopolitical entity, (noting that there may be more than one kind for a given country or other entity)"})

(def GeopoliticalEntity
  "any country, federal province, city or other administrative unit that represents a geophysical location and has some political identity"
  {:db/ident :lcc-cr/GeopoliticalEntity,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "geopolitical entity",
   :rdfs/subClassOf :lcc-cr/GeographicRegion,
   :skos/definition
   "any country, federal province, city or other administrative unit that represents a geophysical location and has some political identity"})

(def Location
  "place or position in time and/or space, including a virtual place"
  {:db/ident :lcc-cr/Location,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "location",
   :skos/definition
   "place or position in time and/or space, including a virtual place"})

(def Region
  "area that is a continuous part of a surface, space, or body"
  {:db/ident :lcc-cr/Region,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "region",
   :skos/definition
   "area that is a continuous part of a surface, space, or body"})

(def Territory
  "geopolitical entity, typically considered an area of special geopolitical interest, related to a country or other geopolitical entity"
  {:db/ident :lcc-cr/Territory,
   :rdf/type :owl/Class,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "territory",
   :rdfs/subClassOf :lcc-cr/GeopoliticalEntity,
   :skos/definition
   "geopolitical entity, typically considered an area of special geopolitical interest, related to a country or other geopolitical entity",
   :skos/note
   "Certain territories are included in the ISO 3166-2 code set without an alpha 2 or alpha 3 code. In these cases, the numeric code for the subregion may have more than 3 characters in their corresponding numeric region codes."})

(def hasEnglishFullName
  "the full name, if different from the short form of the country name, in lower case"
  {:db/ident :lcc-cr/hasEnglishFullName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "has English full name",
   :rdfs/subPropertyOf :lcc-lr/hasEnglishName,
   :skos/definition
   "the full name, if different from the short form of the country name, in lower case"})

(def hasEnglishShortName
  "the short form of the country name, in English"
  {:db/ident :lcc-cr/hasEnglishShortName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "has English short name",
   :rdfs/subPropertyOf :lcc-lr/hasEnglishName,
   :skos/definition "the short form of the country name, in English"})

(def hasEnglishShortNameInCapitals
  "the short form of the country name, in English (capitals)"
  {:db/ident :lcc-cr/hasEnglishShortNameInCapitals,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "has English short name in capitals",
   :rdfs/subPropertyOf :lcc-lr/hasEnglishName,
   :skos/definition
   "the short form of the country name, in English (capitals)"})

(def hasFrenchFullName
  "the full name, if different from the short form of the country name, in lower case"
  {:db/ident :lcc-cr/hasFrenchFullName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "has French full name",
   :rdfs/subPropertyOf :lcc-lr/hasFrenchName,
   :skos/definition
   "the full name, if different from the short form of the country name, in lower case"})

(def hasFrenchShortName
  "the short form of the country name, in French"
  {:db/ident :lcc-cr/hasFrenchShortName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "has French short name",
   :rdfs/subPropertyOf :lcc-lr/hasFrenchName,
   :skos/definition "the short form of the country name, in French"})

(def hasFrenchShortNameInCapitals
  "the short form of the country name, in French (capitals)"
  {:db/ident :lcc-cr/hasFrenchShortNameInCapitals,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "has French short name in capitals",
   :rdfs/subPropertyOf :lcc-lr/hasFrenchName,
   :skos/definition "the short form of the country name, in French (capitals)"})

(def hasLatitude
  "the angle formed by the intersection of a line perpendicular to the Earth's surface at a point and the plane of the Equator"
  {:db/ident :lcc-cr/hasLatitude,
   :dcterms/source
   "http://edndoc.esri.com/arcsde/9.1/general_topics/what_coord_sys.htm",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "has latitude",
   :rdfs/range {:owl/onDatatype :xsd/decimal,
                :owl/withRestrictions [{:xsd/maxInclusive 90}
                                       {:xsd/minInclusive -90}],
                :rdf/type       :rdfs/Datatype},
   :skos/definition
   "the angle formed by the intersection of a line perpendicular to the Earth's surface at a point and the plane of the Equator",
   :skos/note
   "Points north of the Equator have positive latitude values, while points south have negative values. Latitude values range from minus 90 to plus 90 degrees. Lines of latitude are also called parallels because a particular value of latitude forms a circle parallel to the Equator."})

(def hasLocalShortName
  "the local, regional, cultural, or indigenous short form of the country name"
  {:db/ident :lcc-cr/hasLocalShortName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "has local short name",
   :rdfs/subPropertyOf :lcc-lr/hasTextualName,
   :skos/definition
   "the local, regional, cultural, or indigenous short form of the country name"})

(def hasLongitude
  "the angle between a plane that passes through the point and the North and South poles, and a reference plane"
  {:db/ident :lcc-cr/hasLongitude,
   :dcterms/source
   "http://edndoc.esri.com/arcsde/9.1/general_topics/what_coord_sys.htm",
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "has longitude",
   :rdfs/range {:owl/onDatatype :xsd/decimal,
                :owl/withRestrictions [{:xsd/maxInclusive 180}
                                       {:xsd/minInclusive -180}],
                :rdf/type       :rdfs/Datatype},
   :skos/definition
   "the angle between a plane that passes through the point and the North and South poles, and a reference plane",
   :skos/note
   "The reference plane is known as the prime meridian. The most common prime meridian passes through Greenwich, United Kingdom. Other examples of prime meridians in use pass through Paris and Bogota. Longitude values range from minus 180 to plus 180 degrees."})

(def hasMaximumLatitude
  "a maximum latitude with respect to a range"
  {:db/ident :lcc-cr/hasMaximumLatitude,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "has maximum latitude",
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :lcc-cr/hasLatitude,
   :skos/definition "a maximum latitude with respect to a range"})

(def hasMaximumLongitude
  "a maximum longitude with respect to a range"
  {:db/ident :lcc-cr/hasMaximumLongitude,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "has maximum longitude",
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :lcc-cr/hasLongitude,
   :skos/definition "a maximum longitude with respect to a range"})

(def hasMinimumLatitude
  "a minimum latitude with respect to a range"
  {:db/ident :lcc-cr/hasMinimumLatitude,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "has minimum latitude",
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :lcc-cr/hasLatitude,
   :skos/definition "a minimum latitude with respect to a range"})

(def hasMinimumLongitude
  "a minimum longitude with respect to a range"
  {:db/ident :lcc-cr/hasMinimumLongitude,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "has minimum longitude",
   :rdfs/range :xsd/decimal,
   :rdfs/subPropertyOf :lcc-cr/hasLongitude,
   :skos/definition "a minimum longitude with respect to a range"})

(def hasNumericRegionCode
  "three-digit numeric code assigned to a region according to some code set"
  {:db/ident :lcc-cr/hasNumericRegionCode,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "has numeric region code",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "three-digit numeric code assigned to a region according to some code set",
   :skos/note
   "For certain territories that do not have an alternate designation (i.e. country or country subdivision code in ISO 3166), the corresponding numeric code may have four digits."})

(def hasRemarks
  "remarks, such as other widely-used country names, names of geographically separated territories covered by the coding system, and so forth"
  {:db/ident :lcc-cr/hasRemarks,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :lcc-cr/GeopoliticalEntity,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "has remarks",
   :rdfs/range :xsd/string,
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "remarks, such as other widely-used country names, names of geographically separated territories covered by the coding system, and so forth"})

(def hasSubregion
  "relates a geographic region to another geographic region that is a designated subregion of it"
  {:db/ident :lcc-cr/hasSubregion,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :lcc-cr/GeographicRegion,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "has subregion",
   :rdfs/range :lcc-cr/GeographicRegion,
   :rdfs/subPropertyOf :cmns-col/hasPart,
   :skos/definition
   "relates a geographic region to another geographic region that is a designated subregion of it"})

(def isIndependent
  "indicates whether a geopolitical entity stands alone or is part of another country"
  {:db/ident :lcc-cr/isIndependent,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/domain :lcc-cr/GeopoliticalEntity,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "is independent",
   :rdfs/range :xsd/boolean,
   :skos/definition
   "indicates whether a geopolitical entity stands alone or is part of another country"})

(def isSubregionOf
  "relates a geographic region to another geographic region that it is a part of"
  {:db/ident :lcc-cr/isSubregionOf,
   :owl/inverseOf :lcc-cr/hasSubregion,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :lcc-cr/GeographicRegion,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "is a subregion of",
   :rdfs/range :lcc-cr/GeographicRegion,
   :rdfs/subPropertyOf :cmns-col/isPartOf,
   :skos/definition
   "relates a geographic region to another geographic region that it is a part of"})

(def usesAdministrativeLanguage
  "relates a country or geopolitical entity to an administrative language that entity uses for international communications"
  {:db/ident :lcc-cr/usesAdministrativeLanguage,
   :rdf/type :owl/ObjectProperty,
   :rdfs/domain :lcc-cr/GeopoliticalEntity,
   :rdfs/isDefinedBy
   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
   :rdfs/label "uses administrative language",
   :rdfs/range :lcc-lr/Language,
   :rdfs/subPropertyOf :cmns-cxtdsg/uses,
   :skos/definition
   "relates a country or geopolitical entity to an administrative language that entity uses for international communications"})