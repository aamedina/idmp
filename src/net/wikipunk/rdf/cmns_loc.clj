(ns net.wikipunk.rdf.cmns-loc
  "This ontology provides a very high level definition of geographic region and geopolitical entity related concepts, including, but not limited to, countries, sub-country regions such as states and provinces, municipalities, etc., extending the Object Management Group (OMG)'s Languages, Countries, and Codes (LCC) ontologies. As such, these terms are automatically mapped to the LCC controlled vocabulary representing ISO 3166 country and country subdivision codes, and may be mapped to other de facto standards such as Geonames and the CIA World Factbook."
  {:cmns-av/copyright ["Copyright (c) 2013-2022 EDM Council, Inc."
                       "Copyright (c) 2013-2022 Object Management Group, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/CMNS/Locations.rdf",
   :dcterms/abstract
   "This ontology provides a very high level definition of geographic region and geopolitical entity related concepts, including, but not limited to, countries, sub-country regions such as states and provinces, municipalities, etc., extending the Object Management Group (OMG)'s Languages, Countries, and Codes (LCC) ontologies. As such, these terms are automatically mapped to the LCC controlled vocabulary representing ISO 3166 country and country subdivision codes, and may be mapped to other de facto standards such as Geonames and the CIA World Factbook.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :owl/imports ["https://www.omg.org/spec/Commons/TextDatatype/"
                 "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/"
                 "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI "https://www.omg.org/spec/Commons/20221101/Locations/",
   :rdf/ns-prefix-map
   {"cmns-av"  "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-loc" "https://www.omg.org/spec/Commons/Locations/",
    "cmns-txt" "https://www.omg.org/spec/Commons/TextDatatype/",
    "dcterms"  "http://purl.org/dc/terms/",
    "lcc-cr"   "https://www.omg.org/spec/LCC/Countries/CountryRepresentation/",
    "owl"      "http://www.w3.org/2002/07/owl#",
    "rdf"      "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"     "http://www.w3.org/2000/01/rdf-schema#",
    "skos"     "http://www.w3.org/2004/02/skos/core#",
    "xsd"      "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri "https://www.omg.org/spec/Commons/Locations/",
   :rdfa/prefix "cmns-loc",
   :rdfa/uri "https://www.omg.org/spec/Commons/Locations/",
   :rdfs/label "Commons Locations Ontology",
   :skos/note
   "This ontology is derived from the Financial Industry Business Ontology (FIBO) Locations and Virtual Locations ontologies."})

(def BusinessCenter
  "municipality where business is conducted, especially one that is considered a financial center"
  {:cmns-av/adaptedFrom
   "FpML Business Center and related codes, see http://www.fpml.org/coding-scheme/business-center-7-14.xml",
   :db/ident :cmns-loc/BusinessCenter,
   :rdf/type :owl/Class,
   :rdfs/label "business center",
   :rdfs/subClassOf :cmns-loc/Municipality,
   :skos/definition
   "municipality where business is conducted, especially one that is considered a financial center"})

(def County
  "political and administrative division of a country, state or province, providing certain local governmental services"
  {:db/ident :cmns-loc/County,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "county"},
   :rdfs/subClassOf :lcc-cr/CountrySubdivision,
   :skos/definition
   {:rdf/language "en",
    :rdf/value
    "political and administrative division of a country, state or province, providing certain local governmental services"}})

(def FederalCapitalArea
  "geopolitical entity that is or includes the municipality or capital city that acts as the seat of the federal government"
  {:cmns-av/explanatoryNote
   "The capital administrative region of some federations includes those for which the capital is situated other than within one of the states or provinces which make up the country as a whole.",
   :db/ident :cmns-loc/FederalCapitalArea,
   :rdf/type :owl/Class,
   :rdfs/label "federal capital area",
   :rdfs/subClassOf :lcc-cr/GeopoliticalEntity,
   :skos/definition
   "geopolitical entity that is or includes the municipality or capital city that acts as the seat of the federal government",
   :skos/example
   "Examples include the District of Columbia in the US, and the Canberra area in Australia."})

(def FederalState
  "self-governing geopolitical unit which forms part of a wider geopolitical unit that is recognized as a country"
  {:cmns-av/explanatoryNote
   "This type of entity, variously referred to as a state, province or canton, has a level of self government including its own legal system and court jurisdiction, but cedes a level of autonomy to the federation of which it forms a part.",
   :db/ident :cmns-loc/FederalState,
   :rdf/type :owl/Class,
   :rdfs/label "federal state",
   :rdfs/subClassOf :lcc-cr/CountrySubdivision,
   :skos/definition
   "self-governing geopolitical unit which forms part of a wider geopolitical unit that is recognized as a country"})

(def Municipality
  "urban administrative division having corporate status and usually powers of self-government or jurisdiction"
  {:cmns-av/adaptedFrom "http://en.wikipedia.org/wiki/Municipality",
   :cmns-av/explanatoryNote
   "A municipality is a general-purpose administrative subdivision, as opposed to a special-purpose district.",
   :db/ident :cmns-loc/Municipality,
   :rdf/type :owl/Class,
   :rdfs/label "municipality",
   :rdfs/subClassOf :lcc-cr/GeopoliticalEntity,
   :skos/definition
   "urban administrative division having corporate status and usually powers of self-government or jurisdiction",
   :skos/example
   "A municipality can be any political jurisdiction from a sovereign state, such as the Principality of Monaco, or a small village, such as West Hampton Dunes, New York.",
   :skos/scopeNote
   "The territory over which a municipality has jurisdiction may encompass:\n- only one populated place such as a city, town, or village\n- several of such places (e.g., early jurisdictions in the state of New Jersey (1798-1899) as townships governing several villages, Municipalities of Mexico)\n- only parts of such places, sometimes boroughs of a city such as the 34 municipalities of Santiago, Chile."})

(def PhysicalLocation
  "location in physical space"
  {:db/ident        :cmns-loc/PhysicalLocation,
   :rdf/type        :owl/Class,
   :rdfs/label      "physical location",
   :rdfs/subClassOf :lcc-cr/Location,
   :skos/definition "location in physical space"})

(def VirtualLocation
  "place that is not located in any single physical location; a network location without geographic boundaries"
  {:db/ident :cmns-loc/VirtualLocation,
   :owl/disjointWith :cmns-loc/PhysicalLocation,
   :rdf/type :owl/Class,
   :rdfs/label {:rdf/language "en",
                :rdf/value    "virtual location"},
   :rdfs/subClassOf :lcc-cr/Location,
   :skos/definition
   "place that is not located in any single physical location; a network location without geographic boundaries"})

(def hasBusinessCenter
  "identifies a location where business is conducted, and hence the business calendar used to adjust dates"
  {:db/ident :cmns-loc/hasBusinessCenter,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has business center",
   :rdfs/range :cmns-loc/BusinessCenter,
   :rdfs/subPropertyOf :cmns-loc/hasMunicipality,
   :skos/definition
   "identifies a location where business is conducted, and hence the business calendar used to adjust dates"})

(def hasCityName
  "indicates the name of a large, permanent, and densely settled place"
  {:cmns-av/adaptedFrom
   ["https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1"
    "https://en.wikipedia.org/wiki/City"],
   :cmns-av/explanatoryNote
   "Typical working definitions for small-city populations start at around 100,000 people. Common population definitions for an urban area (city or town) range between 1,500 and 50,000 people, with most U.S states using a minimum between 1,500 and 5,000 inhabitants. Some jurisdictions set no such minima.",
   :cmns-av/usageNote
   "This property should be used in cases where a formal individual for the business center or municipality is not available. Note that Geonames could be used as a source in cases where an individual is desired. Use the property cmns-loc;hasMunicipality in cases where an individual is available. Also note that with respect to an address, this property may stand in for any village, town, or city of any size.",
   :db/ident :cmns-loc/hasCityName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "has city name",
   :rdfs/subPropertyOf :cmns-txt/hasTextValue,
   :skos/definition
   "indicates the name of a large, permanent, and densely settled place"})

(def hasCountry
  "indicates a country, such as one that is recognized by the United Nations"
  {:cmns-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :db/ident :cmns-loc/hasCountry,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has country",
   :rdfs/range :lcc-cr/Country,
   :rdfs/subPropertyOf :cmns-loc/hasRegion,
   :skos/definition
   "indicates a country, such as one that is recognized by the United Nations"})

(def hasCounty
  "indicates a country subdivision providing certain local governmental services"
  {:db/ident :cmns-loc/hasCounty,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has county",
   :rdfs/range :cmns-loc/County,
   :rdfs/subPropertyOf :cmns-loc/hasSubdivision,
   :skos/definition
   "indicates a country subdivision providing certain local governmental services"})

(def hasCoverageArea
  "indicates a geographic region in which some service is provided, or to which some policy applies, or in which something is available"
  {:db/ident :cmns-loc/hasCoverageArea,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has coverage area",
   :rdfs/range :lcc-cr/GeographicRegion,
   :rdfs/subPropertyOf :cmns-loc/hasRegion,
   :skos/definition
   "indicates a geographic region in which some service is provided, or to which some policy applies, or in which something is available"})

(def hasMunicipality
  "indicates a business center, city, or municipality"
  {:cmns-av/usageNote
   "Note that certain greater metropolitan areas span multiple counties or states (e.g., the greater Washington, D.C. area, which includes parts of Maryland and Virginia, and divided/disputed cities such as Jerusalem), thus hasMunicipality is a subproperty of hasRegion rather than hasSubdivision.",
   :db/ident :cmns-loc/hasMunicipality,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has municipality",
   :rdfs/range :cmns-loc/Municipality,
   :rdfs/subPropertyOf :cmns-loc/hasRegion,
   :skos/definition "indicates a business center, city, or municipality"})

(def hasRegion
  "indicates a demarcated area on the surface of the Earth"
  {:db/ident :cmns-loc/hasRegion,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has region",
   :rdfs/range :lcc-cr/GeographicRegion,
   :rdfs/subPropertyOf :cmns-loc/isLocatedAt,
   :skos/definition "indicates a demarcated area on the surface of the Earth"})

(def hasSubdivision
  "identifies a country subdivision (state, province, region, etc.)"
  {:cmns-av/adaptedFrom
   "https://www.gleif.org/en/about-lei/common-data-file-format/lei-cdf-format/lei-cdf-format-version-2-1",
   :db/ident :cmns-loc/hasSubdivision,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "has subdivision",
   :rdfs/range :lcc-cr/CountrySubdivision,
   :rdfs/subPropertyOf :cmns-loc/hasRegion,
   :skos/definition
   "identifies a country subdivision (state, province, region, etc.)"})

(def hasURL
  "links something to a web resource that specifies its location on a computer network and a method for retrieving it"
  {:cmns-av/synonym "has uniform resource locator",
   :db/ident :cmns-loc/hasURL,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "has URL",
   :rdfs/range :xsd/anyURI,
   :skos/definition
   "links something to a web resource that specifies its location on a computer network and a method for retrieving it"})

(def hasWebsite
  "links something to a page or set of related web pages located under a single domain name, typically produced by a single person or organization"
  {:cmns-av/explanatoryNote
   "Web Design and Applications involve the standards for building and Rendering Web pages, including HTML, CSS, SVG, device APIs, and other technologies for Web Applications ('WebApps'). HTML (the Hypertext Markup Language) and CSS (Cascading Style Sheets) are two of the core technologies for building Web pages. HTML provides the structure of the page, CSS the (visual and aural) layout, for a variety of devices and services.",
   :db/ident :cmns-loc/hasWebsite,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/label "has website",
   :rdfs/range :xsd/anyURI,
   :rdfs/seeAlso "https://www.w3.org/standards/webdesign/",
   :rdfs/subPropertyOf :cmns-loc/hasURL,
   :skos/definition
   "links something to a page or set of related web pages located under a single domain name, typically produced by a single person or organization"})

(def isLocatedAt
  "relates something to a location, which might be physical or virtual"
  {:db/ident :cmns-loc/isLocatedAt,
   :rdf/type :owl/ObjectProperty,
   :rdfs/label "is located at",
   :rdfs/range :lcc-cr/Location,
   :skos/definition
   "relates something to a location, which might be physical or virtual"})