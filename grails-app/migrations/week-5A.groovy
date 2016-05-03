databaseChangeLog = {

    changeSet(author: "sarah (generated)", id: "1462247660581-1") {
        createTable(tableName: "quote") {
            column(autoIncrement: "true", name: "id", type: "BIGINT") {
                constraints(primaryKey: "true", primaryKeyName: "quotePK")
            }

            column(name: "version", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "text", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }
}
