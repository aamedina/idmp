(ns net.wikipunk.rdf.idmp-ucum
  "The Unified Code for Units of Measure (UCUM) was developed by Regenstrief Institute and the UCUM Organization as a unambiguous system of units and their combinations. This ontology specifies the UCUM code system, and is intended to cover the units of measure specified therein, as described by the ISO 11240:2012 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement standard."
  {:cmns-av/copyright ["Copyright (c) 2022 EDM Council, Inc."
                       "Copyright (c) 2022 Pistoia Alliance, Inc."],
   :dcat/downloadURL
   "https://raw.githubusercontent.com/edmcouncil/idmp/master/EXT/Extensions/UnifiedCodeForUnitsOfMeasure.rdf",
   :dcterms/abstract
   "The Unified Code for Units of Measure (UCUM) was developed by Regenstrief Institute and the UCUM Organization as a unambiguous system of units and their combinations. This ontology specifies the UCUM code system, and is intended to cover the units of measure specified therein, as described by the ISO 11240:2012 Health informatics - Identification of medicinal products - Data elements and structures for the unique identification and exchange of units of measurement standard.",
   :dcterms/license "http://opensource.org/licenses/MIT",
   :idmp-chg/hasMaturityLevel :idmp-chg/Informative,
   :owl/imports
   ["https://www.omg.org/spec/Commons/Designators/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO21090-HarmonizedDatatypes/"
    "https://www.omg.org/spec/Commons/QuantitiesAndUnits/"
    "https://www.omg.org/spec/Commons/Classifiers/"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/"
    "https://www.omg.org/spec/Commons/Identifiers/"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11240-UnitsOfMeasurement/"
    "https://www.omg.org/spec/Commons/Collections/"
    "https://www.omg.org/spec/Commons/TextDatatype/"
    "https://www.omg.org/spec/Commons/AnnotationVocabulary/"],
   :owl/versionIRI
   "https://spec.pistoiaalliance.org/idmp/ontology/EXT/20220901/Extensions/UnifiedCodeForUnitsOfMeasure/",
   :rdf/ns-prefix-map
   {"cmns-av" "https://www.omg.org/spec/Commons/AnnotationVocabulary/",
    "cmns-cls" "https://www.omg.org/spec/Commons/Classifiers/",
    "cmns-col" "https://www.omg.org/spec/Commons/Collections/",
    "cmns-dsg" "https://www.omg.org/spec/Commons/Designators/",
    "cmns-id" "https://www.omg.org/spec/Commons/Identifiers/",
    "cmns-qtu" "https://www.omg.org/spec/Commons/QuantitiesAndUnits/",
    "cmns-txt" "https://www.omg.org/spec/Commons/TextDatatype/",
    "dcterms" "http://purl.org/dc/terms/",
    "idmp-chg"
    "https://spec.pistoiaalliance.org/idmp/ontology/META/ChangeManagement/",
    "idmp-dtp"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO21090-HarmonizedDatatypes/",
    "idmp-ucum"
    "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Extensions/UnifiedCodeForUnitsOfMeasure/",
    "idmp-uom"
    "https://spec.pistoiaalliance.org/idmp/ontology/ISO/ISO11240-UnitsOfMeasurement/",
    "owl" "http://www.w3.org/2002/07/owl#",
    "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
    "skos" "http://www.w3.org/2004/02/skos/core#",
    "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdf/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Extensions/UnifiedCodeForUnitsOfMeasure/",
   :rdfa/prefix "idmp-ucum",
   :rdfa/uri
   "https://spec.pistoiaalliance.org/idmp/ontology/EXT/Extensions/UnifiedCodeForUnitsOfMeasure/",
   :rdfs/label "Unified Code for Units of Measure (UCUM) Ontology"})

(def AmountOfSubstance
  "base quantity kind defined in the Unified Code for Units Of Measure (UCUM) System of Units for the quantity or number of discrete atomic-scale particles in a given sample of matter divided by the Avogadro constant"
  {:cmns-av/explanatoryNote
   "The particles or entities may be molecules, atoms, ions, electrons, or other, depending on the context, and should be specified.",
   :cmns-av/symbol "n",
   :cmns-dsg/isDefinedIn :idmp-ucum/UnifiedCodeForUnitsOfMeasure,
   :db/ident :idmp-ucum/AmountOfSubstance,
   :dcterms/source "https://ucum.org/ucum.html#section-Base-Units",
   :rdf/type [:cmns-qtu/BaseQuantityKind :owl/NamedIndividual],
   :rdfs/label "amount of substance",
   :skos/definition
   "base quantity kind defined in the Unified Code for Units Of Measure (UCUM) System of Units for the quantity or number of discrete atomic-scale particles in a given sample of matter divided by the Avogadro constant"})

(def Ampoule
  "presentation unit that is a sealed vial made of glass or plastic that contains a sterile medicinal solution or a powder that is usually made into a solution for subcutaneous, intramuscular, or intravenous injection"
  {:db/ident :idmp-ucum/Ampoule,
   :rdf/type [:idmp-uom/UnitOfPresentation :owl/NamedIndividual],
   :rdfs/label "ampoule",
   :skos/definition
   "presentation unit that is a sealed vial made of glass or plastic that contains a sterile medicinal solution or a powder that is usually made into a solution for subcutaneous, intramuscular, or intravenous injection"})

(def Dalton
  "conversion-based unit of mass defined in the Unified Code for Units Of Measure (UCUM) System of Units"
  {:cmns-av/symbol ["Da" "da"],
   :cmns-dsg/hasDescription
   "1/12 of the mass of an unbound neutral atom of carbon-12 in its nuclear and electronic ground state and at rest, approximately 1.66×10^−27 kg",
   :cmns-dsg/isDefinedIn :idmp-ucum/UnifiedCodeForUnitsOfMeasure,
   :cmns-qtu/hasQuantityKind :idmp-ucum/Mass,
   :cmns-qtu/isDerivedFrom :idmp-ucum/Kilogram,
   :db/ident :idmp-ucum/Dalton,
   :dcterms/source "https://ucum.org/ucum.html#section-Derived-Unit-Atoms",
   :idmp-uom/isSIQuantity false,
   :rdf/type [:owl/NamedIndividual :cmns-qtu/ConversionBasedUnit],
   :rdfs/label "dalton",
   :skos/definition
   "conversion-based unit of mass defined in the Unified Code for Units Of Measure (UCUM) System of Units"})

(def Dimension-L
  "dimension that is the measurement of how far apart objects or points are"
  {:cmns-av/symbol "L",
   :cmns-cls/classifies :idmp-ucum/Length,
   :cmns-dsg/isDefinedIn :cmns-qtu/InternationalSystemOfQuantities,
   :db/ident :idmp-ucum/Dimension-L,
   :rdf/type [:cmns-qtu/QuantityDimension :owl/NamedIndividual],
   :rdfs/label "dimension - L",
   :skos/definition
   "dimension that is the measurement of how far apart objects or points are"})

(def Dimension-M
  "dimension that is the measurement of a body's inertial property or how much matter it contains"
  {:cmns-av/symbol "M",
   :cmns-cls/classifies :idmp-ucum/Mass,
   :cmns-dsg/isDefinedIn :cmns-qtu/InternationalSystemOfQuantities,
   :db/ident :idmp-ucum/Dimension-M,
   :rdf/type [:cmns-qtu/QuantityDimension :owl/NamedIndividual],
   :rdfs/label "dimension - M",
   :skos/definition
   "dimension that is the measurement of a body's inertial property or how much matter it contains"})

(def Gram
  "base unit of mass defined in the Unified Code for Units Of Measure (UCUM) System of Units"
  {:cmns-av/explanatoryNote
   "The kilogram, as of 2019, is defined by the International Bureau of Weights and Measures from the fixed numerical value of the Planck constant (h), which is 6.62607015×10^−34 kg⋅m^2⋅s^−1",
   :cmns-av/symbol "g",
   :cmns-dsg/isDefinedIn :idmp-ucum/UnifiedCodeForUnitsOfMeasure,
   :db/ident :idmp-ucum/Gram,
   :dcterms/source "https://ucum.org/ucum.html#section-Base-Units",
   :idmp-uom/isSIQuantity true,
   :rdf/type [:cmns-qtu/BaseUnit :owl/NamedIndividual],
   :rdfs/label "gram",
   :skos/definition
   "base unit of mass defined in the Unified Code for Units Of Measure (UCUM) System of Units"})

(def GramsPerMole
  "conversion-based unit of molecular weight defined in the Unified Code for Units Of Measure (UCUM) System of Units"
  {:cmns-av/symbol "g/mol",
   :cmns-dsg/hasDescription "1.66054018667494 × 10^-21 kg",
   :cmns-dsg/isDefinedIn :idmp-ucum/UnifiedCodeForUnitsOfMeasure,
   :cmns-qtu/hasQuantityKind :idmp-ucum/MolarMass,
   :cmns-qtu/isDerivedFrom [:idmp-ucum/Gram :idmp-ucum/Mole],
   :db/ident :idmp-ucum/GramsPerMole,
   :dcterms/source "https://ucum.org/ucum.html#section-Derived-Unit-Atoms",
   :idmp-uom/isSIQuantity false,
   :rdf/type [:cmns-qtu/ConversionBasedUnit :owl/NamedIndividual],
   :rdfs/label "grams per mole",
   :skos/definition
   "conversion-based unit of molecular weight defined in the Unified Code for Units Of Measure (UCUM) System of Units"})

(def Kilo
  "prefix defined in the Unified Code for Units Of Measure (UCUM) System of Units"
  {:cmns-av/symbol "k",
   :cmns-dsg/hasDescription "10^3=(10^3)^1",
   :cmns-dsg/isDefinedIn :idmp-ucum/UnifiedCodeForUnitsOfMeasure,
   :db/ident :idmp-ucum/Kilo,
   :dcterms/source "https://ucum.org/ucum.html#section-Prefixes",
   :rdf/type [:cmns-qtu/Prefix :owl/NamedIndividual],
   :rdfs/label "kilo",
   :skos/definition
   "prefix defined in the Unified Code for Units Of Measure (UCUM) System of Units"})

(def Kilogram
  "conversion-based unit of mass"
  {:cmns-av/symbol "kg",
   :cmns-dsg/hasDescription "10^3 grams",
   :cmns-dsg/isDefinedIn [:idmp-ucum/UnifiedCodeForUnitsOfMeasure
                          :cmns-qtu/InternationalSystemOfUnits],
   :cmns-qtu/hasFactor :idmp-ucum/Kilo,
   :cmns-qtu/hasQuantityKind :idmp-ucum/Mass,
   :cmns-qtu/isDerivedFrom :idmp-ucum/Gram,
   :db/ident :idmp-ucum/Kilogram,
   :dcterms/source "https://ucum.org/ucum.html#section-Base-Units",
   :idmp-uom/isSIQuantity true,
   :rdf/type [:cmns-qtu/PrefixedUnit :owl/NamedIndividual],
   :rdfs/label "kilogram",
   :rdfs/seeAlso "https://www.nist.gov/si-redefinition/kilogram",
   :skos/definition "conversion-based unit of mass",
   :skos/note
   "Note that in the International System of Units (SI), the kilogram is considered the base unit rather than the gram, which is the base unit in the UCUM."})

(def Length
  "base quantity kind that is the quantitative measure of distance, i.e., of how far apart objects or points are"
  {:cmns-av/symbol "l",
   :cmns-dsg/isDefinedIn [:cmns-qtu/InternationalSystemOfQuantities
                          :idmp-ucum/UnifiedCodeForUnitsOfMeasure],
   :cmns-qtu/hasDimension :idmp-ucum/Dimension-L,
   :db/ident :idmp-ucum/Length,
   :dcterms/source "https://ucum.org/ucum.html#section-Base-Units",
   :rdf/type [:cmns-qtu/BaseQuantityKind :owl/NamedIndividual],
   :rdfs/label "length",
   :skos/definition
   "base quantity kind that is the quantitative measure of distance, i.e., of how far apart objects or points are"})

(def Liter
  "derived unit of volume defined in the Unified Code for Units Of Measure (UCUM) System of Units"
  {:cmns-av/symbol "l",
   :cmns-dsg/hasDescription "cubic meter: m^3",
   :cmns-dsg/isDefinedIn :idmp-ucum/UnifiedCodeForUnitsOfMeasure,
   :cmns-qtu/hasQuantityKind :idmp-ucum/Volume,
   :cmns-qtu/isDerivedFrom :idmp-ucum/Meter,
   :db/ident :idmp-ucum/Liter,
   :dcterms/source "https://ucum.org/ucum.html#section-Derived-Unit-Atoms",
   :idmp-uom/isSIQuantity true,
   :rdf/type [:owl/NamedIndividual :cmns-qtu/ConversionBasedUnit],
   :rdfs/label "liter",
   :skos/definition
   "derived unit of volume defined in the Unified Code for Units Of Measure (UCUM) System of Units"})

(def Mass
  "base quantity kind for the measure of a measure of a body's inertial property or how much matter it contains"
  {:cmns-av/explanatoryNote
   "Note that as of 2018, mass has been redefined in the International System of Units in terms of Planck's constant, h. The kilogram is defined by taking the fixed numerical value of the Planck constant, h, to be 6.626 070 15 × 10-34 when expressed in the unit J s, which is equal to kg m^2 s^−1, where the metre and the second are defined in terms of the speed of light, 𝒸, and the hyperfine transition frequency of the caesium-133 atom, ∆ν, respectively.",
   :cmns-av/symbol "m",
   :cmns-dsg/isDefinedIn :idmp-ucum/UnifiedCodeForUnitsOfMeasure,
   :cmns-qtu/hasDimension :idmp-ucum/Dimension-M,
   :db/ident :idmp-ucum/Mass,
   :rdf/type [:cmns-qtu/BaseQuantityKind :owl/NamedIndividual],
   :rdfs/label "mass",
   :skos/definition
   "base quantity kind for the measure of a measure of a body's inertial property or how much matter it contains"})

(def MassConcentration
  "derived quantity kind defined in the International System of Quantities for the quantitative measure of the mass of a constituent divided by the total volume of the mixture"
  {:cmns-av/explanatoryNote
   ["Note that the Unified Code for Units Of Measure (UCUM) uses mass concentration primarily with respect to gram percent, which is a dimensionless unit in that system."
    "For a pure chemical the mass concentration equals its density (mass divided by volume); thus the mass concentration of a component in a mixture can be called the density of a component in a mixture."],
   :cmns-av/symbol ["ρ" "γ" "ML^3"],
   :cmns-dsg/isDefinedIn :cmns-qtu/InternationalSystemOfQuantities,
   :cmns-qtu/isDerivedFrom :idmp-ucum/Mass,
   :db/ident :idmp-ucum/MassConcentration,
   :dcterms/source
   ["https://ucum.org/ucum.html#section-Base-Units"
    "ISO 31-0:1992(E) Quantities and Units - Part 0: General principles, clause A.6.6"],
   :rdf/type [:cmns-qtu/DerivedQuantityKind :owl/NamedIndividual],
   :rdfs/label "mass concentration",
   :skos/definition
   "derived quantity kind defined in the International System of Quantities for the quantitative measure of the mass of a constituent divided by the total volume of the mixture"})

(def Meter
  "base unit of length that is the distance traveled by light in vacuum during the time interval of 1/299 792 458 of a second"
  {:cmns-av/symbol "m",
   :cmns-dsg/isDefinedIn [:idmp-ucum/UnifiedCodeForUnitsOfMeasure
                          :cmns-qtu/InternationalSystemOfUnits],
   :db/ident :idmp-ucum/Meter,
   :dcterms/source "https://ucum.org/ucum.html#section-Base-Units",
   :idmp-uom/isSIQuantity true,
   :rdf/type [:cmns-qtu/BaseUnit :owl/NamedIndividual],
   :rdfs/label "meter",
   :rdfs/seeAlso
   ["https://www.nist.gov/pml/owm/si-units-length"
    "https://www.nist.gov/system/files/documents/pml/div683/museum-length.pdf"],
   :skos/definition
   "base unit of length that is the distance traveled by light in vacuum during the time interval of 1/299 792 458 of a second"})

(def Micro
  "prefix defined in the Unified Code for Units Of Measure (UCUM) System of Units"
  {:cmns-av/symbol "μ",
   :cmns-dsg/hasDescription "10^-6=(10^3)^-2",
   :cmns-dsg/isDefinedIn :idmp-ucum/UnifiedCodeForUnitsOfMeasure,
   :db/ident :idmp-ucum/Micro,
   :dcterms/source "https://ucum.org/ucum.html#section-Prefixes",
   :rdf/type [:cmns-qtu/Prefix :owl/NamedIndividual],
   :rdfs/label "micro",
   :skos/definition
   "prefix defined in the Unified Code for Units Of Measure (UCUM) System of Units"})

(def Microgram
  "conversion-based unit of mass defined in the Unified Code for Units Of Measure (UCUM) System of Units"
  {:cmns-av/symbol ["μg" "mcg"],
   :cmns-dsg/hasDescription "10^-6 grams",
   :cmns-dsg/isDefinedIn :idmp-ucum/UnifiedCodeForUnitsOfMeasure,
   :cmns-qtu/hasFactor :idmp-ucum/Micro,
   :cmns-qtu/hasQuantityKind :idmp-ucum/Mass,
   :cmns-qtu/isDerivedFrom :idmp-ucum/Gram,
   :db/ident :idmp-ucum/Microgram,
   :dcterms/source "https://ucum.org/ucum.html#section-Derived-Unit-Atoms",
   :idmp-uom/isSIQuantity true,
   :rdf/type [:cmns-qtu/PrefixedUnit :owl/NamedIndividual],
   :rdfs/label "microgram",
   :skos/definition
   "conversion-based unit of mass defined in the Unified Code for Units Of Measure (UCUM) System of Units"})

(def MicrogramsPerMilliliter
  "conversion-based unit of mass concentration (density) used to measure volume in milliliters in order to estimate weight or mass in micrograms"
  {:cmns-av/symbol "μg/ml",
   :cmns-dsg/hasDescription "10^-6 grams per 10^-3 liters",
   :cmns-dsg/isDefinedIn :idmp-ucum/UnifiedCodeForUnitsOfMeasure,
   :cmns-qtu/hasFactor :idmp-ucum/Micro,
   :cmns-qtu/hasQuantityKind :idmp-ucum/MassConcentration,
   :cmns-qtu/isDerivedFrom [:idmp-ucum/Gram :idmp-ucum/Liter],
   :db/ident :idmp-ucum/MicrogramsPerMilliliter,
   :dcterms/source "https://ucum.org/ucum.html#section-Derived-Unit-Atoms",
   :idmp-uom/isSIQuantity true,
   :rdf/type [:cmns-qtu/PrefixedUnit :owl/NamedIndividual],
   :rdfs/label "micrograms per milliliter",
   :skos/definition
   "conversion-based unit of mass concentration (density) used to measure volume in milliliters in order to estimate weight or mass in micrograms"})

(def Milli
  "prefix defined in the Unified Code for Units Of Measure (UCUM) System of Units"
  {:cmns-av/symbol "m",
   :cmns-dsg/hasDescription "10^-3=(10^3)-1",
   :cmns-dsg/isDefinedIn :idmp-ucum/UnifiedCodeForUnitsOfMeasure,
   :db/ident :idmp-ucum/Milli,
   :dcterms/source "https://ucum.org/ucum.html#section-Prefixes",
   :rdf/type [:cmns-qtu/Prefix :owl/NamedIndividual],
   :rdfs/label "milli",
   :skos/definition
   "prefix defined in the Unified Code for Units Of Measure (UCUM) System of Units"})

(def Milligram
  "conversion-based unit of mass defined in the Unified Code for Units Of Measure (UCUM) System of Units"
  {:cmns-av/symbol "mg",
   :cmns-dsg/hasDescription "10^-3 grams",
   :cmns-dsg/isDefinedIn :idmp-ucum/UnifiedCodeForUnitsOfMeasure,
   :cmns-qtu/hasFactor :idmp-ucum/Milli,
   :cmns-qtu/hasQuantityKind :idmp-ucum/Mass,
   :cmns-qtu/isDerivedFrom :idmp-ucum/Gram,
   :db/ident :idmp-ucum/Milligram,
   :dcterms/source "https://ucum.org/ucum.html#section-Derived-Unit-Atoms",
   :idmp-uom/isSIQuantity true,
   :rdf/type [:cmns-qtu/PrefixedUnit :owl/NamedIndividual],
   :rdfs/label "milligram",
   :skos/definition
   "conversion-based unit of mass defined in the Unified Code for Units Of Measure (UCUM) System of Units"})

(def MilligramsPerMilliliter
  "conversion-based unit of mass concentration (density) used to measure volume in milliliters in order to estimate weight or mass in milligrams"
  {:cmns-av/symbol "mg/ml",
   :cmns-dsg/hasDescription "10^-3 grams per 10^-3 liters",
   :cmns-dsg/isDefinedIn :idmp-ucum/UnifiedCodeForUnitsOfMeasure,
   :cmns-qtu/hasFactor :idmp-ucum/Milli,
   :cmns-qtu/hasQuantityKind :idmp-ucum/MassConcentration,
   :cmns-qtu/isDerivedFrom [:idmp-ucum/Gram :idmp-ucum/Liter],
   :db/ident :idmp-ucum/MilligramsPerMilliliter,
   :dcterms/source "https://ucum.org/ucum.html#section-Derived-Unit-Atoms",
   :idmp-uom/isSIQuantity true,
   :rdf/type [:owl/NamedIndividual :cmns-qtu/PrefixedUnit],
   :rdfs/label "milligrams per milliliter",
   :skos/definition
   "conversion-based unit of mass concentration (density) used to measure volume in milliliters in order to estimate weight or mass in milligrams"})

(def Milliliter
  "conversion-based unit of volume defined in the Unified Code for Units Of Measure (UCUM) System of Units"
  {:cmns-av/symbol "ml",
   :cmns-dsg/hasDescription "10^-3 liters",
   :cmns-dsg/isDefinedIn :idmp-ucum/UnifiedCodeForUnitsOfMeasure,
   :cmns-qtu/hasFactor :idmp-ucum/Milli,
   :cmns-qtu/hasQuantityKind :idmp-ucum/Volume,
   :cmns-qtu/isDerivedFrom :idmp-ucum/Liter,
   :db/ident :idmp-ucum/Milliliter,
   :dcterms/source "https://ucum.org/ucum.html#section-Derived-Unit-Atoms",
   :idmp-uom/isSIQuantity true,
   :rdf/type [:cmns-qtu/PrefixedUnit :owl/NamedIndividual],
   :rdfs/label "milliliter",
   :skos/definition
   "conversion-based unit of volume defined in the Unified Code for Units Of Measure (UCUM) System of Units"})

(def MolarMass
  "derived quantity kind defined in the Unified Code for Units Of Measure (UCUM) System of Units for the mass of a substance divided by its amount of substance in moles"
  {:cmns-dsg/isDefinedIn :idmp-ucum/UnifiedCodeForUnitsOfMeasure,
   :cmns-qtu/isDerivedFrom :idmp-ucum/Mass,
   :db/ident :idmp-ucum/MolarMass,
   :dcterms/source "https://ucum.org/ucum.html#section-Derived-Unit-Atoms",
   :rdf/type [:cmns-qtu/DerivedQuantityKind :owl/NamedIndividual],
   :rdfs/label "molar mass",
   :skos/definition
   "derived quantity kind defined in the Unified Code for Units Of Measure (UCUM) System of Units for the mass of a substance divided by its amount of substance in moles",
   :skos/example
   "For example, the molar mass of water (H2O) is approximately 1 × 2 + 16 = 18 g/mol.",
   :skos/note
   "The molar mass of elements in grams per mole is numerically equal to their atomic mass in unified atomic mass units (u) or daltons (Da). The molar mass of compounds is equal to the sum of molar masses of the atoms which form the compound."})

(def Mole
  "base unit of amount of substance defined in the Unified Code for Units Of Measure (UCUM) System of Units that is the measure of how many elementary entities of a given substance are in an object or sample"
  {:cmns-av/symbol "mol",
   :cmns-dsg/hasDescription "6.02214076×10^23 elementary entities",
   :cmns-dsg/isDefinedIn :idmp-ucum/UnifiedCodeForUnitsOfMeasure,
   :db/ident :idmp-ucum/Mole,
   :dcterms/source "https://ucum.org/ucum.html#section-Base-Units",
   :idmp-uom/isSIQuantity true,
   :rdf/type [:cmns-qtu/BaseUnit :owl/NamedIndividual],
   :rdfs/label "mole",
   :rdfs/seeAlso
   "https://www.nist.gov/system/files/documents/pml/div683/museum-length.pdf",
   :skos/definition
   "base unit of amount of substance defined in the Unified Code for Units Of Measure (UCUM) System of Units that is the measure of how many elementary entities of a given substance are in an object or sample"})

(def OID-2.16.840.1.113883.6.8
  "ISO Object Identifier (OID) for the Unified Code for Units of Measure (UCUM) code set"
  {:cmns-id/identifies :idmp-ucum/UnifiedCodeForUnitsOfMeasure,
   :cmns-txt/hasTextValue "2.16.840.1.113883.6.8",
   :db/ident :idmp-ucum/OID-2.16.840.1.113883.6.8,
   :dcterms/source
   "ISO 11240:2021, clause 4.6.2.2 and clause 4.6.2.3 Code System, Table 3",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-ST,
   :rdf/type [:idmp-uom/CodeSystemIdentifier :owl/NamedIndividual],
   :rdfs/label "Unified Code for Units of Measure identifier",
   :skos/definition
   "ISO Object Identifier (OID) for the Unified Code for Units of Measure (UCUM) code set"})

(def Tablet
  "presentation unit that is a solid unit dosage form of one or more medicaments with or without suitable excipients and prepared either by molding or by compression"
  {:db/ident :idmp-ucum/Tablet,
   :rdf/type [:idmp-uom/UnitOfPresentation :owl/NamedIndividual],
   :rdfs/label "tablet",
   :skos/definition
   "presentation unit that is a solid unit dosage form of one or more medicaments with or without suitable excipients and prepared either by molding or by compression"})

(def UnifiedAtomicMassUnit
  "conversion-based unit of mass defined in the Unified Code for Units Of Measure (UCUM) System of Units"
  {:cmns-av/symbol ["u" "AMU"],
   :cmns-dsg/hasDescription "1.6605402 × 10^-24 kg",
   :cmns-dsg/isDefinedIn :idmp-ucum/UnifiedCodeForUnitsOfMeasure,
   :cmns-qtu/hasQuantityKind :idmp-ucum/Mass,
   :cmns-qtu/isDerivedFrom :idmp-ucum/Kilogram,
   :db/ident :idmp-ucum/UnifiedAtomicMassUnit,
   :dcterms/source "https://ucum.org/ucum.html#section-Derived-Unit-Atoms",
   :idmp-uom/isSIQuantity true,
   :rdf/type [:owl/NamedIndividual :cmns-qtu/ConversionBasedUnit],
   :rdfs/label "unified atomic mass unit",
   :skos/definition
   "conversion-based unit of mass defined in the Unified Code for Units Of Measure (UCUM) System of Units"})

(def UnifiedCodeForUnitsOfMeasure
  "code system intended to include all units of measures being contemporarily used in international science, engineering, and business"
  {:cmns-av/abbreviation "UCUM",
   :cmns-av/copyright
   "Copyright 1999-2021 Regenstrief Institute, Inc. All rights reserved.",
   :cmns-dsg/hasDescription
   "The Unified Code for Units of Measure (UCUM) was developed by Regenstrief Institute and the UCUM Organization as a unambiguous system of units and their combinations. The purpose is to facilitate unambiguous electronic communication of quantities together with their units. The focus is on electronic communication, as opposed to communication between humans. A typical application of The Unified Code for Units of Measure are electronic data interchange (EDI) protocols, but there is nothing that prevents it from being used in other types of machine communication.",
   :cmns-dsg/hasName
   [:idmp-ucum/UnifiedCodeForUnitsOfMeasureCodeSystemName
    :idmp-ucum/UnifiedCodeForUnitsOfMeasureCodeSystemFullName],
   :cmns-id/isIdentifiedBy :idmp-ucum/OID-2.16.840.1.113883.6.8,
   :db/ident :idmp-ucum/UnifiedCodeForUnitsOfMeasure,
   :owl/versionInfo "Version: 2.1, Revision: 442",
   :rdf/type [:owl/NamedIndividual :idmp-uom/UnitOfMeasureIdentificationScheme],
   :rdfs/label "Unified Code for Units of Measure",
   :rdfs/seeAlso ["https://ucum.org/trac" "https://ucum.nlm.nih.gov/"],
   :skos/definition
   "code system intended to include all units of measures being contemporarily used in international science, engineering, and business",
   :skos/note
   "UCUM has been adopted internationally by many organizations such as IEEE, DICOM, LOINC, and HL7, and is also in the ISO 11240:2012 standard"})

(def UnifiedCodeForUnitsOfMeasureCodeSystemFullName
  "official name for the Unified Code for Units of Measure code system"
  {:cmns-dsg/isNameOf :idmp-ucum/UnifiedCodeForUnitsOfMeasure,
   :cmns-txt/hasTextValue "Unified Code for Units of Measure",
   :db/ident :idmp-ucum/UnifiedCodeForUnitsOfMeasureCodeSystemFullName,
   :dcterms/source "ISO 11240:2021, clause 4.6.2.3 Code System, Table 3",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-ST,
   :rdf/type [:idmp-uom/CodeSystemFullName :owl/NamedIndividual],
   :rdfs/label "Unified Code for Units of Measure code system full name",
   :skos/definition
   "official name for the Unified Code for Units of Measure code system"})

(def UnifiedCodeForUnitsOfMeasureCodeSystemName
  "short name that uniquely identifies the Unified Code for Units of Measure code system for communications between people"
  {:cmns-dsg/isNameOf :idmp-ucum/UnifiedCodeForUnitsOfMeasure,
   :cmns-txt/hasTextValue "UCUM",
   :db/ident :idmp-ucum/UnifiedCodeForUnitsOfMeasureCodeSystemName,
   :dcterms/source "ISO 11240:2021, clause 4.6.2.3 Code System, Table 3",
   :idmp-dtp/isEncodedAs :idmp-dtp/DatatypeCode-ST,
   :rdf/type [:idmp-dtp/CodeSystemName :owl/NamedIndividual],
   :rdfs/label "Unified Code for Units of Measure code system name",
   :skos/definition
   "short name that uniquely identifies the Unified Code for Units of Measure code system for communications between people"})

(def Volume
  "derived quantity kind defined in the Unified Code for Units Of Measure (UCUM) System of Units for the quantitative measure expressing the amount of three-dimensional space enclosed by a closed surface"
  {:cmns-av/symbol "L^3",
   :cmns-dsg/isDefinedIn :idmp-ucum/UnifiedCodeForUnitsOfMeasure,
   :cmns-qtu/isDerivedFrom :idmp-ucum/Length,
   :db/ident :idmp-ucum/Volume,
   :dcterms/source "https://ucum.org/ucum.html#section-Derived-Unit-Atoms",
   :rdf/type [:cmns-qtu/DerivedQuantityKind :owl/NamedIndividual],
   :rdfs/label "volume",
   :skos/definition
   "derived quantity kind defined in the Unified Code for Units Of Measure (UCUM) System of Units for the quantitative measure expressing the amount of three-dimensional space enclosed by a closed surface"})